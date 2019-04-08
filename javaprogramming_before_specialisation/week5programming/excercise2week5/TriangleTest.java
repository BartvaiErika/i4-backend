package week5programming.excercise2week5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//Create the TriangleTest class that tests that the Triangle is working correctly as both Triangle and Shape.

public class TriangleTest {

    @Test
    void testTriangle() {
        Triangle triangle = new Triangle();
        String actual = triangle.getName();
        String expected = "triangle";
        Assertions.assertEquals(expected,actual,"Triangle is correct.");

    }

}
