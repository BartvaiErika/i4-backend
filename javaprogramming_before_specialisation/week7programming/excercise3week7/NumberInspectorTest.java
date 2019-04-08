package week7programming.excercise3week7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class NumberInspectorTest {
    private List<Integer> numbers = Arrays.asList(456,555,434,532,632,347,542,334,12,634,134,342,6756);
    NumberInspector numberInspector = new NumberInspector();

    @Test
    void biggestTest() {
        Integer actuell = numberInspector.biggest(numbers);
        Integer expected = 6756;
        Assertions.assertEquals(expected, actuell);
    }

    @Test
    void smallestTest() {
        Integer actuell = numberInspector.smallest(numbers);
        Integer expected = 12;
        Assertions.assertEquals(expected, actuell);
    }
}