package week6programming.excercise3week6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Optional;

class CoffeeMakerTest {

    @Test
    void testAutomaticCoffeeMachine() {
        String name = "Automatic coffee machine";
        Optional<CoffeeMaker> optionalCoffeeMaker = CoffeeMakers.get(name);
        Coffee coffee = optionalCoffeeMaker.get().brew();
        Assertions.assertEquals(name, coffee.getMadeBy());
        Assertions.assertEquals(Integer.valueOf(5), coffee.getBrewedTime());
    }

    @Test
    void testFrenchPress() {
        String name = "French press";
        Optional<CoffeeMaker> optionalCoffeeMaker = CoffeeMakers.get(name);
        Coffee coffee = optionalCoffeeMaker.get().brew();
        Assertions.assertEquals(name, coffee.getMadeBy());
        Assertions.assertEquals(Integer.valueOf(10), coffee.getBrewedTime());
    }

    @Test
    void testAutoDrip() {
        String name = "Auto drip";
        Optional<CoffeeMaker> optionalCoffeeMaker = CoffeeMakers.get(name);
        Coffee coffee = optionalCoffeeMaker.get().brew();
        Assertions.assertEquals(name, coffee.getMadeBy());
        Assertions.assertEquals(Integer.valueOf(6), coffee.getBrewedTime());
    }

}