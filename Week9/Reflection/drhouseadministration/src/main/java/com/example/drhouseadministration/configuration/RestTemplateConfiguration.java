package com.example.mytodolist_week9.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestTemplateConfiguration {

    @Bean
    RestTemplateConfiguration restTemplate() {
        return new RestTemplateConfiguration();
    }
}