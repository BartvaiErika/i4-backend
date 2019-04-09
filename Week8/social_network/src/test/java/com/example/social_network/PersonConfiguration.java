package com.example.social_network;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("dataset")
public class PersonConfiguration {

    @Getter
    @Setter
    Person person;

    @Bean
    Person person() {
        return person;
    }
}
