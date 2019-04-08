package week5programming.planet;

import java.util.Optional;

public class CalculatorApplication {

    public static void main(String[] args) {
        WeightCalculator calculator = new WeightCalculator();

        Double weight = 63.2;
        calculator.displayInAllPlanets(weight);

        System.out.println("Individual questions ---");
        Optional<Double> weightInMars = calculator.calculate(weight, "Mars");
        if (weightInMars.isPresent()) {
            System.out.println("Your weight in Mars is: " + weightInMars.get());
        }
        Optional<Double> weightInNibiru = calculator.calculate(weight, "Nibiru");
        if (weightInNibiru.isPresent()) {
            System.out.println("Your weight in Nibiru is: " + weightInNibiru.get());
        } else {
            System.out.println("That planet is not in our calculate");
        }

    }

}