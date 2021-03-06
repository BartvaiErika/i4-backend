package com.example.drhouse_beds.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties("communication.illnesses")
public class DrHouseConfiguration {

  @Getter
  @Setter
  private Map<String, String> diagnosesBook;

  @Bean
  Map<String, String> publishMedicalReferenceBook(){
    return diagnosesBook;
  }
}