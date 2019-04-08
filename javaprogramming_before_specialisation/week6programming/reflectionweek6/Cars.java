package week6programming.reflectionweek6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

    public class Cars {
        public static List<Car> getCarsList() {
            List<Car> cars = new ArrayList<>();
            List<String> brands = Arrays.asList("Audi", "Mercedes", "Seat", "Skoda", "Tesla", "Bmw", "Peugeot", "Citroen", "Jeep", "Ferrari");
            for (String brand : brands) {
                cars.add(getNextCar(brand));
            }
            return cars;
        }

        public static Car getNextCar(String brand) {
            List<Car> cars = Arrays.asList(new AutomaticCar(brand), new ManualCar(brand));
            Random random = new Random();
            int randomPosition = random.nextInt(2);
            return cars.get(randomPosition);

        }
    }


