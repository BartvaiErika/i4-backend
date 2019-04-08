package week6programming.Cars;

import java.util.Arrays;
import java.util.List;
import java.util.Arrays;

public class CarApplication {
    public static void main(String[] args) {
        //The CarApplication creates one Hansel and using the Cars class tries 10 cars.
        Hansel hansel = new Hansel();
        List<Car> cars = Cars.carsAsList();
        for (Car car:cars) {
            hansel.haveATry(car);
        }

//        I love this Manual Audi
//        I love this Automatic Mercedes
//        I love this Manual Seat
//        I love this Automatic Skoda
//        I love this Automatic Tesla
//        I love this Automatic Bmw
//        I love this Automatic Peugeot
//        I love this Manual Citroen
//        I love this Manual Jeep
//        I love this Automatic Ferrari

    }
}
