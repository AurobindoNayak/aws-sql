package com.ants.producer.eventproducer;

import com.ants.producer.vo.EventVO;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.header.Header;
import org.apache.kafka.common.header.internals.RecordHeader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@Component
@Slf4j
public class OpticommEventProducer {

    @Value("${spring.kafka.topic}")
    public String topic;

    public KafkaTemplate<String, String> kafkaTemplate;


    public OpticommEventProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public CompletableFuture publishOpticommEvent(EventVO eventVO,String externalId) throws Exception {
        log.info("inside publishOpticommEvent:: ");
        String value = new ObjectMapper().writeValueAsString(eventVO.getEvent());
        CompletableFuture<SendResult<String, String>> result = kafkaTemplate.send(topic, eventVO.getEventId(), value);

        return result.whenComplete((sendResult, throwable) -> {
            if (throwable != null) {
                log.info("inside publishOpticommEvent if block:: ");
                sendErrorResult(eventVO.getEventId(), value, throwable);
            } else {
                log.info("inside publishOpticommEvent else block:: ");
                sendSuccessResult(eventVO.getEventId(), value, sendResult);
            }
        });
    }

    public SendResult publishOpticommEvent_approach2(EventVO eventVO) throws Exception {
        log.info("inside publishOpticommEvent approach2:: ");
        String value = new ObjectMapper().writeValueAsString(eventVO.getEvent());
        SendResult<String, String> result = kafkaTemplate.send(topic, eventVO.getEventId(), value).get();
        sendSuccessResult(eventVO.getEventId(),value,result);
        return null;
    }

    public CompletableFuture publishOpticommEvent_approach3(EventVO eventVO,String externalId) throws Exception {
        log.info("inside publishOpticommEvent approach3:: ");
        String value = new ObjectMapper().writeValueAsString(eventVO.getEvent());
        ProducerRecord producerRecord = buildProducerRecord(eventVO.getEventId(),value,externalId);
        CompletableFuture<SendResult<String, String>> result = kafkaTemplate.send(producerRecord);

        return result.whenComplete((sendResult, throwable) -> {
            if (throwable != null) {
                log.info("inside publishOpticommEvent if block:: ");
                sendErrorResult(eventVO.getEventId(), value, throwable);
            } else {
                log.info("inside publishOpticommEvent else block:: ");
                sendSuccessResult(eventVO.getEventId(), value, sendResult);
            }
        });
    }


    private ProducerRecord<String,String> buildProducerRecord(String key, String value,String externalId) {
        List<Header> headerList = new ArrayList<>();
        headerList.add(new RecordHeader("externalId", externalId.getBytes()));
        log.info("header value is {}",externalId);
        return  new ProducerRecord<>(topic,null,key,value,headerList);
    }

    private void sendSuccessResult(String eventId, String value, SendResult<String, String> sendResult) {
    log.info("Message published successfully for the key{}, value{}, and the partition is{},",
            eventId, value, sendResult.getRecordMetadata().partition());
    }

    private void sendErrorResult(String eventId, String writeValueAsString, Throwable throwable) {
        log.error("unable to publish the event for id {} , " +
                "and the error message is {}", eventId, throwable.getMessage());
    }


}
