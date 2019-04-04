package com.example.lombokexcercises;

import lombok.experimental.UtilityClass;
import org.springframework.context.annotation.Bean;

import java.util.Set;
@UtilityClass
public class Coffebeans {
    private final String WHITE = "white";
    private final String BLACK = "black";

    private Set<CoffeeBean> beans = Set.of(new CoffeeBean(WHITE), new CoffeeBean(BLACK));

    public CoffeeBean getWhiteBean() {return filter(WHITE);}
    public CoffeeBean getBlackBean() {return filter(BLACK);}

    public CoffeeBean filter(String colour) {
        return beans.stream()
                .filter(e->e.equals(colour))
                .findFirst().orElseThrow();
    }
}
