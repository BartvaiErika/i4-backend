package week6programming.reflectionweek6;

public class AutomaticCar extends Car {
    public AutomaticCar(String brand) {
        super(brand);
    }

    @Override
    public String drive() {
        return "Automatic " + getBrand();
    }

}