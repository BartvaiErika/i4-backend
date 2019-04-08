package week6programming.Cars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CarTest {
    private AutomaticCar automaticCar = new AutomaticCar("Tesla") ;
    private ManualCar manualCar = new ManualCar("Skoda") ;

    @Test
    void driveManual() {
        String expectedCar = "Manual Skoda";
        String actuellCar = manualCar.drive();
        Assertions.assertEquals(expectedCar,actuellCar);
    }

    @Test
    void driveAutomatic() {
        String expectedCar = "Automatic Tesla";
        String actuellCar = automaticCar.drive();
        Assertions.assertEquals(expectedCar,actuellCar);

    }



}