package reflection.controller;

import reflection.controller.FileReader;
import reflection.model.Fruit;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.experimental.UtilityClass;

@UtilityClass
public class FruitReader {
        //getDelivery
        public static List<String> asList(String filePath) {
            return FileReader.lines(filePath)
                    .collect(Collectors.toList());
        }

        protected  static Fruit toFruits(Map.Entry<String, Long> fruitsAsString) {
            return Fruit.builder().name(fruitsAsString.getKey()).amount(fruitsAsString.getValue()).build();
        }

}
