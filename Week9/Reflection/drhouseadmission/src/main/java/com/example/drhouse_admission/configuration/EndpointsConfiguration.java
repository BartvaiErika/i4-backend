package com.example.drhouse_admission.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EndpointsConfiguration {

  @Bean
  RestTemplate restTemplate() {
    return new RestTemplate();
  }
}