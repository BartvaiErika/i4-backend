package week5programming.planet;

import java.util.List;
import java.util.Optional;

public class WeightCalculator {

    private List<Planet> planets = Planets.asList();

    public void displayInAllPlanets(Double weight) {
        for (Planet planet : planets) {
            display(weight, planet);
        }
    }
    private void display(Double weight, Planet planet) {
        String name = planet.getName();
        Double newWeight = planet.weight(weight);
        System.out.println("Your weight in " + name + " is " + newWeight + " kg");
    }

    public Optional<Double> calculate(Double weight, String planetName) {
        for (Planet planet : planets) {
            if (has(planet, planetName)) {
                Double newWeight = planet.weight(weight);
                return Optional.of(newWeight);
            }
        }
        return Optional.empty();
    }

    private boolean has(Planet planet, String planetName) {
        return planet.getName().equalsIgnoreCase(planetName);
    }

}