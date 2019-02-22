package reflection.controller;

import reflection.model.Fruit;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;

public class Assistant {
    //translates a list of fruit names into a list of fruit

    public static List<Fruit> translateIntoListOfFruits(List<String> fruitsAsString) {
        //List<Fruit> fruits = FruitReader.asList("reflection/file/delivery");
        return countFruits(fruitsAsString).entrySet().stream()
                .map(e->FruitReader.toFruits(e)).sorted().collect(Collectors.toList());
    }

    public static Map<String, Long> countFruits(List<String> fruits) {
          return fruits.stream()
          .collect(groupingBy(Function.identity(), counting()));
    }





}
