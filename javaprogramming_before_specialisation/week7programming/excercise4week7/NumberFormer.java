package week7programming.excercise4week7;

import java.util.Arrays;
import java.util.List;

public class NumberFormer {
    public List<String>formNumber(Integer number) {
        String numberAsString = String.valueOf(number);
        String[] separated = numberAsString.split("");
        List<String> separatedNumbers = Arrays.asList(separated);
        return separatedNumbers;
    }
}
