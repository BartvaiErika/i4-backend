package week7programming.excercise1week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoneyCalculatorTest {

    private MoneyCalculator calculator = new MoneyCalculator();

    @Test
    void calculatorTest() {
        List<Integer> payments = Arrays.asList(2, 3, 4);

        Integer total = calculator.calculate(payments);

        Integer expected = 9;
        Assertions.assertEquals(expected, total);
    }
}