//package Week8.reflectionWeek8;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//class ThermostatTest {
//    private Thermostat thermostat = new Thermostat(temp -> temp < 0, temp -> temp + " degrees Celsius.");
//    private Thermostat thermostat2 = new Thermostat(temp -> temp >= 80, temp -> (temp + 273.15) + " degrees Kelvin.");
//
//    @Test
//    void testCold() {
//        String message = thermostat.sense(12.3);
//        String expected = "12.3 degrees Celsius.";
//        Assertions.assertEquals(expected,message);
//
//        message = thermostat.sense(-3.0);
//        expected = "Warning!";
//        Assertions.assertEquals(expected,message);
//    }
//
//    @Test
//    void testHot() {
//        String message = thermostat.sense(79.0);
//        String expected = "Temperature is 352.15 degrees Kelvin.";
//        Assertions.assertEquals(expected,message);
//
//        message = thermostat.sense(80.0);
//        expected = "Warning!";
//        Assertions.assertEquals(expected,message);
//    }
//}
//
