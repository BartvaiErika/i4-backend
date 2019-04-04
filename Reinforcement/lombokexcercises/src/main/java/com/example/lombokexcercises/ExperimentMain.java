package com.example.lombokexcercises;

import lombok.extern.java.Log;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Queue;
//@Log
@Configuration
public class ExperimentMain {

    @Bean
    ApplicationRunner runner() {
        return args -> {
            BeanGenerator beanGenerator = new BeanGenerator();
            Queue<CoffeeBean> coffeeBeans = beanGenerator.generateCoffeeBeans();
            Experiment.getLastOneBean(coffeeBeans);
            //log.severe(Experiment.getLastOneBean(coffeeBeans).toString());
        };
    }
}
