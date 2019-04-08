package Week8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class NumberFilterTest {

    private List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    private NumberFilter numberFilter = new NumberFilter();

    @Test
    void getEven() {
        List<Integer> expected = Arrays.asList(2,4,6);
        List<Integer> actuell = numberFilter.getEven(numbers);
        Assertions.assertEquals(expected, actuell);
    }

    @Test
    void getOdd() {
        List<Integer> expected = Arrays.asList(1,3,5);
        List<Integer> actuell = numberFilter.getOdd(numbers);
        Assertions.assertEquals(expected, actuell);
    }

}