/*
package com.ants.springreactive.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.*;

@WebFluxTest(controllers = FluxController.class)
@AutoConfigureWebTestClient
class FluxControllerTest {

    @Autowired
    WebTestClient webClient;

    @Test
    void getFlux() {
        webClient.get()
                .uri("/getFlux")
                .exchange()
                .expectBody(String.class)
                .returnResult()
                .getResponseBody();

    }

    @Test
    void getFlux1() {
        var flux = webClient.get()
                .uri("/getFlux")
                .exchange()
                //.expectBody(String.class)
                .returnResult(String.class)
                .getResponseBody();

        StepVerifier.create(flux).expectNext("HelloWorld").verifyComplete();

    }

    @Test
    void getFlux2() {
        var flux = webClient.get()
                .uri("/getFlux")
                .exchange()
                .expectBody(String.class)
                .consumeWith(x -> {
                    String responseBody = x.getResponseBody();
                    assert (responseBody.equalsIgnoreCase("HELLOWORLD"));
                });


    }

    @Test
    void getMono() {
        var mono = webClient.get()
                .uri("/getMono")
                .exchange()
                .returnResult(String.class);
    }

    @Test
    void getMono1() {
        var mono = webClient.get()
                .uri("/getMono")
                .exchange()
                .expectBody(String.class)
                .consumeWith(x -> {
                    var response = x.getResponseBody();
                    assert (response.equals("Hello World"));
                });

    }

    @Test
    void senddataInTimrInterval() {
        var stream = webClient.get()
                .uri("/geStream")
                .exchange()
                .returnResult(Long.class)
                .getResponseBody();
        StepVerifier.create(stream).expectNext(0l, 1l, 2l).thenCancel().verify();
    }
}*/
