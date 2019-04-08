package week6programming.Cars;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.Arrays;

public class Cars {

//    The Cars class has the getNextCar method that receives a brand
//        and creates a random automatic or manual car to return it as a Car.
    public static List<Car> carsAsList() {
        List<Car> cars = new ArrayList<>();
        List<String> brands =
                Arrays.asList("Audi","Mercedes","Seat","Skoda","Tesla","BMW","Peugeot","Citroen","Jeep","Ferrari");
        for (String brand: brands) {
            Car car = getNextCar(brand);
            cars.add(car);
        }
        return cars;
    }

    public static Car getNextCar(String brand) {
        List<Car> cars = Arrays.asList(new AutomaticCar(brand), new ManualCar(brand));
         Random random = new Random();
         Integer kindOfCar = random.nextInt(2);
         Car car = cars.get(kindOfCar);
         return car;
    }
}


