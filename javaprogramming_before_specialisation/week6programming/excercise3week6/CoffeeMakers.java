package week6programming.excercise3week6;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakers {

    public static List<CoffeeMaker> asList() {
        List<CoffeeMaker> listOfCoffeemaker  =
                Arrays.asList(new FrenchPress(), new AutomaticCoffeeMachine(), new AutoDrip());
        return listOfCoffeemaker;
    }

    public static Optional <CoffeeMaker> get (String coffeeMaker) {

        for (CoffeeMaker coffeMaker: asList()) {
            if (coffeMaker.getName().equalsIgnoreCase(coffeeMaker))
            return Optional.of(coffeMaker);
        }
        return Optional.empty();
    }

//    @Override
//    public String getName() {
//
//        return "Auto drip";
//    }
//
//    @Override
//    public Integer getBrewingTime() {
//        return 6;
//    }
}
