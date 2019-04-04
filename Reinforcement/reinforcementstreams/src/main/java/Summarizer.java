import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Summarizer {

    //How many words are in the book?
    public long wordsOfBook(List <String> words) {
        return words.size();
    }

    //How many distinct words are in the book?
    public long  distinctWordsOfBook(List <String> words) {
        return words.stream()
                .distinct()
                .count();
    }

    //Which words belong to the group of the longest words?
    public List<String>longestWords(List<String>words) {
        return words .stream()
                .collect(Collectors.groupingBy(e -> Integer.valueOf(e.length()), Collectors.toList()))
                        .entrySet().stream()
                        .sorted((e1,e2)->e2.getKey().compareTo(e1.getKey()))
                        .limit(5)
                        .map(Map.Entry::getValue)
                        .flatMap(List::stream)
                        .collect(Collectors.toList());
    }

    //Which ones are the most appearing 5 words,
    //sorted by most appearing and how many times do they appear?
    public List<String> mostAppearingWords(List<String>words) {
        return words.stream()
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(e -> e.getValue() + ": " + e.getKey() + " times.")
                .collect(Collectors.toList());
    }

    //Which ones are the most appearing 5 letters,
    // sorted by most appearing and how many times do they appear?
    public List<String> mostAppearingLetters(List<String> words) {
        return words.stream()
                .map(e -> e.split(""))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1,e2)-> e2.getKey().compareTo(e1.getKey()))
                .limit(5)
                .map(e->e.getValue()+": " + e.getKey()+" times.")
                .collect(Collectors.toList());
    }

    //How many times does the name Alice appear?
    public long aliceAppearing (List <String> words){
        return words.stream()
                .filter(e->e.equalsIgnoreCase("Alice"))
                .collect(Collectors.counting());
    }

}
