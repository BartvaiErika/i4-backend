package week6programming.Cars;

public abstract class Car {
//    A car has a brand.
//    A car can drive. When it does, it returns a message saying “<car kind> <brand>”.
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    protected abstract String drive();
}
