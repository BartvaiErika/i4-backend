package week11programming.editingStrings;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EditingOfStrings {

//    Given two strings, write a method to check if they are one edit (or zero edits) away.
//    Create meaningful unit tests. At the end of each test,
//    display how many milliseconds it took to the method to perform its calculation.
    public List<String> words = Arrays.asList("pale", "pales", "bale", "bake");

// public Boolean editableInOneStepNewMethod(String word1, String word2) {
//        return words.stream()
//                .filter(e->(!e.equals("")));
////                .filter((e1,e2)->(e1.contains(e2)))
////                .filter((e1,e2)-> e1.equalsIgnoreCase(e2));
//    }

    public Boolean editableInOneStep(String word1, String word2) {
        Integer differenz = 0;
        if ((word1.compareTo(word2) >= -1) && (word1.compareTo(word2) <= 1))
            return true;
        else {
            for (int i = 0; i < word1.length() - 1; i++) {
                for (int j = 0; j < word2.length() - 1; j++) {
                   if (!(word1.charAt(i) == (word2.charAt(j))))
                        differenz++;
                }
            }
            if (differenz <=1) return true;
        }
        return false;
    }
}
