package com.example.morseencoder.view.communication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestTemplateConfiguration {

    @Bean
    RestTemplateConfiguration restTemplate() {
        return new RestTemplateConfiguration();
    }
}