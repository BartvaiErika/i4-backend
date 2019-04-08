package week5programming.excercise1week5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {
//Create the CircleTest class that tests that the Circle is working correctly as both Circle and Shape.
    @Test
    void testCirkle() {
        String actual = "";
        String expected = "circle";
        Assertions.assertEquals(expected,actual,"Shape is correct.");

    }

}
