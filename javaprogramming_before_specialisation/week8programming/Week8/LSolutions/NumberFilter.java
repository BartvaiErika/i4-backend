package Week8.LSolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NumberFilter {

    private List<Integer> filter(List<Integer> numbers, Predicate<Integer> condition) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer number : numbers) {
            if (condition.test(number)) {
                filtered.add(number);
            }
        }
        return filtered;
    }

    public List<Integer> getEven(List<Integer> numbers) {
        return filter(numbers, e -> e % 2 == 0);
    }

    public List<Integer> getOdd(List<Integer> numbers) {
        return filter(numbers, e -> e % 2 != 0);
    }
}