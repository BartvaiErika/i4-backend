package com.example.lombokexcercises;

import lombok.experimental.UtilityClass;

import java.util.Objects;
import java.util.Queue;
import java.util.stream.IntStream;

// @UtilityClass, lombok will automatically generate a private constructor
// that throws an exception, flags as error any explicit constructors you add,
// and marks the class final.
// If the class is an inner class, the class is also marked static.

@UtilityClass
public class Experiment {

    CoffeeBean getLastOneBean(Queue <CoffeeBean> coffeeBeans) {
        checkChoisedBeans(coffeeBeans);
        CoffeeBean lastCoffeeBean = coffeeBeans.poll();
        return lastCoffeeBean;
    }

    void checkChoisedBeans(Queue <CoffeeBean> coffeeBeans) {
        IntStream.generate(() -> 0)
        .takeWhile(e-> coffeeBeans.size() >1)
        .mapToObj(e->putBackBean(coffeeBeans))
        .forEach(coffeeBeans::offer);
    }

    CoffeeBean putBackBean(Queue<CoffeeBean> coffeeBeans) {
        CoffeeBean CoffeeBean1 = coffeeBeans.poll();
        CoffeeBean CoffeeBean2 = coffeeBeans.poll();
        if (Objects.equals(CoffeeBean1,CoffeeBean2))
            return CoffeeBean1;
        return CoffeeBean2;
    }
}
