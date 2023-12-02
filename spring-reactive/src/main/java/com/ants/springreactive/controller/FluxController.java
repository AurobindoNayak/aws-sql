package com.ants.springreactive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
public class FluxController {

    @GetMapping("/getFlux")
    public Flux<String> getFlux() {
        return Flux.just("Hello", "World");
    }

    @GetMapping("/getMono")
    public Mono<String> getMono() {
        return Mono.just("Hello World");
    }

    //This is used to send data in particular time interval
    @GetMapping("/geStream")
    public Flux<Long> senddataInTimrInterval() {
        return Flux.interval(Duration.ofSeconds(1)).log();
    }
}
