package week6programming.reflectionweek6;

import java.util.List;
import java.util.*;
public class CarApplication {
    public static void main(String[] args) {
        Hansel hansel = new Hansel();
        List<Car> cars = Cars.getCarsList();
        for (Car car : cars) {
            hansel.haveATry(car);
        }
    }
}