package week7programming.excercise8week7;

import java.util.Arrays;
import java.util.List;

public class RoemerNumberValidator {

    public List<String> roemerNumbers = Arrays.asList("I","V","X","L","C","D","M");

//    public List<String> roemerNumbers() {
//        List<String> roemerNumbers = Arrays.asList("I","V","X","L","C","D","M");
//        return roemerNumbers;
//    }

    public Boolean validate(String roemerNumber) {
        for (int i = 0; i < roemerNumber.length(); i++) {
            Character position = roemerNumber.charAt(i);
            for (String number:roemerNumbers) {
                if (position.equals(number)) return true;
            }
        }
        return false;
    }

}
