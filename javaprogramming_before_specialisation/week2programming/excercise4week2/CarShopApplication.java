//Created by Erika
package week2programming.excercise4week2;

public class CarShopApplication {
    public static void main(String[] args) {

        Seller seller = new Seller();
        Car car1 = new Car("BMW");
        String brandCar1 = car1.getBrand();
        Car car2 = new Car("AODI");
        String brandCar2 = car2.getBrand();
        Car car3 = new Car("VW");
        String brandCar3 = car3.getBrand();
        seller.describeBrand(car1);
        seller.describeBrand(car2);
        seller.describeBrand(car3);

    }
}
