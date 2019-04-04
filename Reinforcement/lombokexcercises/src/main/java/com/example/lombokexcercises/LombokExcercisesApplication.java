package com.example.lombokexcercises;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Queue;

@Log
//@SpringBootApplication
public class LombokExcercisesApplication {

    public static void main(String[] args) {
        //SpringApplication.run(LombokExcercisesApplication.class, args);


        BeanGenerator beanGenerator = new BeanGenerator();
        Queue<CoffeeBean> coffeeBeans = beanGenerator.generateCoffeeBeans();
        CoffeeBean lastOneBean = Experiment.getLastOneBean(coffeeBeans);

        log.info("One message");
        log.info(lastOneBean.toString());
    }

}
