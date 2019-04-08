package week7programming.excercise7week7;

public class VehicleType1 extends Vehicle {
    public VehicleType1(Integer capacity) {
        super(capacity);
    }

    @Override
    public Integer getCapacity() {
        return 1;
    }
}
