package com.ants.ms.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
//@Configuration
@Data
public class ReadConfig {
    @Value("${spring-endpoint.url}")
    private String url;
    @Value("${spring-default.port}")
    private int port;
}
