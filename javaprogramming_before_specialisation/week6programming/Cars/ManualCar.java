package week6programming.Cars;

public class ManualCar extends Car {

    public ManualCar(String brand) {
        super(brand);
    }

    @Override
    protected String drive() {
        return "Manual" + " "+ getBrand();
    }
}
