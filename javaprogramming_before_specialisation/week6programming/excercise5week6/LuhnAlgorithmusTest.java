package week6programming.excercise5week6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LuhnAlgorithmusTest {

    @Test
    public void test() {
        LuhnAlgorithmus luhnAlgorithmus = new LuhnAlgorithmus();
        Boolean result1 = luhnAlgorithmus.legitimate("378282246310005");
        Boolean result2 = luhnAlgorithmus.legitimate("388282246310005");

        Assertions.assertTrue(result1);
        Assertions.assertFalse(result2);
    }

}
