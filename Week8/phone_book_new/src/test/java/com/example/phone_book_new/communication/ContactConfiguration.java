package com.example.phone_book_new.communication;

import com.example.phone_book_new.persistence.domain.Contact;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("dataset")
public class ContactConfiguration {

    @Setter
    List<Contact> contacts;

    @Bean
    List<Contact> contacts() {
        return contacts;
    }

}