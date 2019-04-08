package week9programming.ceasarweek9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Caesar {

    public String chiper(String plantext, Integer key) {
        return Stream.of(plantext.split("")).map(letter -> cipherLetter(letter, key)).collect(Collectors.joining());
    }


    public String cipherLetter(String letter, Integer key) {
//        List<String> specialCharactersInSolr = Arrays.asList("+", "-", "&&", "||", "!", "(", ")", "{", "}",
//                "[", "]", "^", "~", "*", "?", ":");
        int valueOfLetter = letter.charAt(0);
        if (!Character.isAlphabetic(valueOfLetter)) {
            return letter;
        }
        int shiftedValue = valueOfLetter + key;
        if (Character.isUpperCase(valueOfLetter)) {
            shiftedValue = (shiftedValue - 65) % 26 + 65;
        } else {
            shiftedValue = (shiftedValue - 97) % 26 + 97;
        }
        //if (letter.equals(" ")) shiftedValue =32;

    Character newletter = (char) shiftedValue;
        return newletter.toString();
}

}