package com.example.drhouseadministration.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestTemplateConfiguration {

    @Bean
    RestTemplateConfiguration restTemplate() {
        return new RestTemplateConfiguration();
    }
}