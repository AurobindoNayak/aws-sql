package com.ants.consumer.kafkaconsumer.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LibraryEventConsmer {

    @KafkaListener(topics = {"library-topic"})
    public void consumeMessage(ConsumerRecord<Integer, String> consumerRecord) {
        log.info("consumer record {} ", consumerRecord);
    }
}
