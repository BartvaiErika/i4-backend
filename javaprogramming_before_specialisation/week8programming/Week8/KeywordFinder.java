package Week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class KeywordFinder {
     String  elegant = "The elephant is lifted eleven floors easily with the help of an electricity elevator";

     public List<String> findElegeant(String sentence) {
         return findKeyword(sentence, e->e.startsWith("ele") );
     }
    public List<String>findPlayful(String sentence) {
        return findKeyword(sentence, e->e.endsWith("ful"));
    }

    protected List<String> findKeyword(String sentence, Predicate<String> condition) {
        List<String> result = new ArrayList<>();
        List<String> splitWords = new ArrayList<>();
        splitWords.addAll(Arrays.asList(sentence.split(" ")));
        for (String splitWord : splitWords) {
             if (condition.test(splitWord)) {
                result.add(splitWord);
            }
        }

        return result;
    }


}
