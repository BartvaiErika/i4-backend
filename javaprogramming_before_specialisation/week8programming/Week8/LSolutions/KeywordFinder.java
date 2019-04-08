package Week8.LSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class KeywordFinder {

    public List<String> findElectric(String text) {
        return findWords(text, word -> word.startsWith("ele"));
    }

    public List<String> findWords(String text, Predicate<String> condition) {
        List<String> words = toWords(text);
        return find(words, condition);
    }

    private List<String> toWords(String text) {
        return Arrays.asList(text.split(" "));
    }

    private List<String> find(List<String> words, Predicate<String> condition) {
        List<String> found = new ArrayList<>();
        for (String word : words) {
            if (condition.test(word)) {
                found.add(word);
            }
        }
        return found;
    }


    public List<String> findPlayful(String text) {
        return findWords(text, word -> word.endsWith("ful"));
    }
}