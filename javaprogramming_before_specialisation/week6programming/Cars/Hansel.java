package week6programming.Cars;
import java.util.List;

public class Hansel {
//    The Hansel class has the haveATry method that receives a Car
//        and drives it to display the following message “I love this <car kind> <brand>”.

    public void haveATry (Car car) {
        String myCar = car.drive();
        System.out.println("I love this " + myCar + ".");
    }
}
