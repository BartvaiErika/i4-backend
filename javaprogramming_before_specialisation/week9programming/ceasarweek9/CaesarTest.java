package week9programming.ceasarweek9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week9programming.ceasarweek9.Caesar;

public class CaesarTest {

    private Caesar ceasar = new Caesar();
    @Test
    public void chiperTest1() {
        String message = "HELLO";
        String expected = "IFMMP";
        String actual = ceasar.chiper(message,1);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void chiperTest2() {
        String message = "hello, world";
        String expected = "uryyb, jbeyq";
        String actual = ceasar.chiper(message,13);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void chiperTest3() {
        String message = "be sure to drink your Ovaltine";
        String expected = "or fher gb qevax lbhe Binygvar";
        String actual = ceasar.chiper(message,13);
        Assertions.assertEquals(expected,actual);
    }





}
