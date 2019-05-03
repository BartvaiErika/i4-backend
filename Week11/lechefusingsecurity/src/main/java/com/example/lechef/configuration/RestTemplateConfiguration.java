package com.example.lechef.configuration;

import com.example.lechef.persistence.Recipe;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {

  @Bean
  RestTemplate restTemplate() {
    return new RestTemplate();
  }

  public Recipe postForObject(String url, Recipe recipe) {
    return Recipe.builder().build();
  }
}