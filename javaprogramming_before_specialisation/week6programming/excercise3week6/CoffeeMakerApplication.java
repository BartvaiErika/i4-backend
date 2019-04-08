package week6programming.excercise3week6;

import java.util.Arrays;
import java.util.Optional;
import java.util.List;
public class CoffeeMakerApplication {

    public static void main(String[] args) {
        //String name1 = "Moka pot";
        List<CoffeeMaker> coffeeMakerList = CoffeeMakers.asList();

        for (CoffeeMaker coffeeMaker : coffeeMakerList) {
            Coffee coffee = coffeeMaker.brew();
            System.out.println(coffee.getMadeBy() + " brewed a coffee and it took " + coffee.getBrewedTime() + " Minutes.");

        }

        List<String> names = Arrays.asList("Auto drip", "French press", "Automatic coffee machine");
        for (String name : names) {
            Optional<CoffeeMaker> coffeeMakerOptional = CoffeeMakers.get(name);
            if (coffeeMakerOptional.isPresent())
                System.out.println(coffeeMakerOptional.get().getName()
                        + " brewed a coffee and it took " + coffeeMakerOptional.get().getBrewingTime() + " minutes.");

        }

        Optional<CoffeeMaker> coffeeMakerOptional = CoffeeMakers.get("Moka pot");
        if (!coffeeMakerOptional.isPresent()) {
            System.out.println("The coffee maker with the name Moka pot is not available");

        }
    }
}
//    Output:
//    Automatic coffee machine brewed a coffee and it took 5 minutes
//    French press brewed a coffee and it took 10 minutes
//    Auto drip brewed a coffee and it took 6 minutes
//    Automatic coffee machine brewed a coffee and it took 5 minutes
//    French press brewed a coffee and it took 10 minutes
//    Auto drip brewed a coffee and it took 6 minutes
//    The coffee maker with the name Moka pot is not available


