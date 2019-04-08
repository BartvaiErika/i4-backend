package week6programming.Cars;

public class AutomaticCar extends Car {
    public AutomaticCar(String brand) {
        super(brand);
    }

    @Override
    protected String drive() {
        return "Automatic" + " "+ getBrand() ;
    }
}
