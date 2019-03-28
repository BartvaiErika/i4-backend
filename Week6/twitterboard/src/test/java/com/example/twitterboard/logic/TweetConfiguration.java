package com.example.twitterboard.logic;

import com.example.twitterboard.persistance.Tweet;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("dataset")
public class TweetConfiguration {

    @Getter
    @Setter
    Tweet tweet;

    @Setter
    List<Tweet> tweets;

    @Bean
    Tweet tweet() {
        return tweet;
    }

    @Bean
    List<Tweet> tweets() {
        return tweets;
    }

}
