package com.ants.producer.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicCreationConfiguration {

    @Value("${spring.kafka.topic}")
    public String topicName;

    //by using this class we can create the topic programmatically

    //To tell the application to create a new topic using this configuration ,
    // we need to provide the Admin api configuration in the application.properties file

    @Bean
    public NewTopic createOpticommTopic(){
        return TopicBuilder
                .name(topicName)
                .partitions(3)
                .replicas(2)
                .build();
    }
}
