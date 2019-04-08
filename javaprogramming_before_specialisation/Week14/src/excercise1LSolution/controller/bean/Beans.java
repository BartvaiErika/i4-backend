package excercise1LSolution.controller.bean;

import excercise1LSolution.model.Bean;
import lombok.experimental.UtilityClass;

import java.util.Set;

@UtilityClass
public class Beans {

    private final String WHITE = "white";
    private final String BLACK = "black";

    private Set<Bean> beans = Set.of(new Bean(WHITE), new Bean(BLACK));

    public Bean getWhite() {
        return filter(WHITE);
    }

    Bean filter(String color) {
        return beans.stream()
                .filter(e -> e.getColor().equals(color))
                .findFirst().orElseThrow();
    }

    public Bean getBlack() {
        return filter(BLACK);
    }
}