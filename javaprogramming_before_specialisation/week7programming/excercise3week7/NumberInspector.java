package week7programming.excercise3week7;
import java.util.List;

public class NumberInspector {
    public Integer biggest(List<Integer>numbers) {
        Integer biggest =0;
        for (Integer number:numbers) {
            if(number>biggest)
                biggest=number;
        }
        return biggest;
    }
    public Integer smallest(List<Integer>numbers) {
        Integer smallest= biggest(numbers);
        for (Integer number:numbers) {
            if(smallest>number)
                smallest=number;
        }
        return smallest;
    }
}
