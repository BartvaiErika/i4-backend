package reflection;

import reflection.view.FruitCounter;
import reflection.controller.FruitReader;
import reflection.controller.Assistant;
import reflection.model.Fruit;

import java.util.List;

public class FruitShopApp {

    public static void main(String[] args) {
        List<String> fruitsAsString = FruitReader.asList("reflection/file/delivery");
        List<Fruit> fruits = Assistant.translateIntoListOfFruits(fruitsAsString);
                //Assistant.translateIntoListOfFruits(fruits);
        FruitCounter.countFruit(fruits);
    }
}
