package com.ants.producer.controller;

import com.ants.producer.eventproducer.OpticommEventProducer;
import com.ants.producer.vo.EventVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class EventProducerController {

    @Autowired
    OpticommEventProducer opticommEventProducer;

    @PostMapping("/publish-event")
    public ResponseEntity<EventVO> publishEvent(@RequestHeader("externalId") String externalId, @RequestBody EventVO eventVO) throws Exception{
        log.info("inside publishEvent:: {}", eventVO);
        //opticommEventProducer.publishOpticommEvent(eventVO);
        //opticommEventProducer.publishOpticommEvent(eventVO,externalId);
        opticommEventProducer.publishOpticommEvent_approach3(eventVO,externalId);
        return new ResponseEntity<>(eventVO, HttpStatus.CREATED);
    }
}
