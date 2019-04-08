package week5programming.planet;

import java.util.Arrays;
import java.util.List;

public class Planets {

    private static List<Planet> planets = Arrays.asList(
            new Venus(), new Earth(), new Mars()
    );

    public static List<Planet> asList() {
        return planets;
    }

}