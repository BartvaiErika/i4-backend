//Created by Erika
package week2programming.excercise4week2;

public class Seller {
    private Car car;

    public Seller () {}

    public void getCar(Car car){
        car.getBrand();
    }

    public void describeBrand (Car car) {
       System.out.println( car.getBrand() + " The brand of this car is particularly good.");
    }
}
