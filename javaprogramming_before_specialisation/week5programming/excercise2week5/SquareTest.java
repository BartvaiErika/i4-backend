package week5programming.excercise2week5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//Create the SquareTest class that tests that the Square is working correctly as both Square and Shape.

public class SquareTest {

    @Test
    void testSquare() {
        String actual = "";
        String expected = "square";
        Assertions.assertEquals(expected,actual,"Square is correct.");

    }

}
