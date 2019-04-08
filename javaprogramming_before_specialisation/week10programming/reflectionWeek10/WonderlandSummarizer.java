package week10programming.reflectionWeek10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WonderlandSummarizer {

    public static BookReader bookReader = new BookReader();
    public static List<String> words = bookReader.toWordsRecord();

    public static void main(String[] args) {


        System.out.println("Number of words: " + numberOfWords());

        System.out.println("Number distinct of 3 words: " + numberOfDistinctWords());

        System.out.println("Longest 3 words: " + longestWords());

        System.out.println("Most appearing 5 words: " + mostAppearingWords());

        System.out.println("Most appearing 5 letters: " + mostAppearingLetters());

        System.out.println("How many times does the name Alice appear: " + numberOfAliceAppearances());
    }

    //    How many words are in the book?
    public static Long numberOfWords() {
        return words.stream().count();
    }

    //    How many distinct words are in the book?
    public static Long numberOfDistinctWords() {
        return words.stream()
                .distinct()
                .count();
    }
    // Longest 3 words
    public static List<String> longestWords() {
        Map<Integer, List<String>> longestWords = words.stream()
                .collect(Collectors.groupingBy(e -> e.length(), Collectors.toList()));
        List<String> longesWordAsList = longestWords.entrySet().stream()
                .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
                .map(e -> e.getKey() + " | " + e.getValue())
                .limit(3)
                .collect(Collectors.toList());
        return longesWordAsList;
    }
    //    Most appearing 5 words?
    public static List <String> mostAppearingWords() {
        return words.stream()
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getValue() + " | " + e.getKey())
                .limit(5)
                .collect(Collectors.toList());
    }

   public static List<String> mostAppearingLetters() {
       return words.stream()
                .map(word -> word.replaceAll(" ", ""))
                .map(word -> word.split(""))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getValue() + " | " + e.getKey())
                .limit(5)
                .collect(Collectors.toList());
    }

    public static long numberOfAliceAppearances() {
        return words.stream()
                .filter(e -> e.equalsIgnoreCase("Alice"))
                .count();
    }
}


