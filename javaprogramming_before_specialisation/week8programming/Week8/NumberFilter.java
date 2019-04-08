package Week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NumberFilter {


    public List<Integer>getEven(List<Integer>numbers){
        return  filter(numbers,e -> e % 2 == 0);
    }
    public List<Integer>getOdd(List<Integer>numbers){
        return  filter(numbers,e -> e % 2 == 1);
    }

    protected List<Integer> filter(List<Integer> numbers, Predicate<Integer> condition) {
        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (condition.test(number)) {
                result.add(number);
            }
            Integer sum = 898;

        }
        return result;
    }

}
