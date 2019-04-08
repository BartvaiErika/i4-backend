package week6programming.reflectionweek6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarTest {

    private Car automaticCar = new AutomaticCar("Tesla");
    private Car manualCar = new ManualCar("Skoda");

    @Test
    void driveAutomatic() {
        String expectedCar = "Automatic Tesla";
        String actuellCar = automaticCar .drive();
        Assertions.assertEquals(expectedCar, actuellCar);
    }
    @Test
    void driveManual() {
        String expectedCar = "Manual Skoda";
        String actuellCar = manualCar.drive();
        Assertions.assertEquals(expectedCar, actuellCar);
    }
}


