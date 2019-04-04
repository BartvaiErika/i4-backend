package com.example.lombokexcercises;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BeanGenerator {

    private Random random = new Random();

    public Queue<CoffeeBean> generateCoffeeBeans() {
        // you could use the intstream here
        return IntStream.range(0, 1000)
                .mapToObj(toRandomCoffeeBean())
                .collect(Collectors.toCollection(LinkedList::new));
    }

    private IntFunction<CoffeeBean> toRandomCoffeeBean() {
        return n->{
            if(random.nextBoolean()){
                return new CoffeeBean("white");
            } else {
                return new CoffeeBean("black");
            }
        };
    }
    //give you a list of beans back
}
