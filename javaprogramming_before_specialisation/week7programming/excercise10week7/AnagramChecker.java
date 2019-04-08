package week7programming.excercise10week7;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramChecker  {

    protected String word = "documenting";
    public AnagramReader anagramReader = new AnagramReader();
    public List<String> words = anagramReader.toAnagramsRecord();

//    public List<Set<String>> getAnagrams() throws FileNotFoundException {
//
//        Set<String> anagram = new HashSet<>();
//        List<Set<String>> anagrams = new ArrayList<>();
//        System.out.println("Check anagram");
//        try {
//        File file = new File("week7programming/excercise10week7/anagram-words");
//        Scanner scanner = new Scanner(file);
//        //anagrams.add(fileReader.getLines("week7programming/excercise10week7/anagram-words"));
//        scanner.useDelimiter(" ");  //scanner.useDelimiter("\\Z");
//        while (scanner.hasNextLine()) {
//            //anagram = fileReader.getLines("week7programming/excercise10week7/anagram-words");
//            anagram.add(scanner.next());
//            anagrams.add(anagram);
//            scanner.nextLine();
//        }
//        }
//        catch (FileNotFoundException e) {e.printStackTrace(); }
//        return anagrams;
//    }

    public List<String> anagramsList () {
        return words.stream().collect(Collectors.toList());
    }

    public Boolean isAnagram () {
        return words.stream()
                .anyMatch(word -> words.contains(word));
    }

    public Long numberOfPartWords () {
        return words.stream()
                .filter(word->words.contains(word)).count();
    }

    public Integer lengthOfLongestWord () {
        return words
                .stream()
                .collect(Collectors.groupingBy(e->e.length(), Collectors.toList()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                .mapToInt(e->e.getValue()
                .size())
                .max().getAsInt();
    }

    public String longestWord () {
        return words
                .stream()
                .collect(Collectors.groupingBy(e->e.length(), Collectors.toList()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                .mapToInt(e->e.getValue().size())
                .max().toString();
    }

    public Integer lengthOfShortestWord () {
        return words
                .stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.toList()))
                .entrySet().stream()
                .mapToInt(e -> e.getValue().size())
                .min().getAsInt();
    }

    public String shortestWord () {
        return words
                .stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.toList()))
                .entrySet().stream()
                .mapToInt(e -> e.getValue().size())
                .min().toString();
    }

    public List<String> checkPossibleCombinations() {
        List<String> possibleCombination = words.stream()
                .filter(word -> words.contains(word))
                .collect(Collectors.toList());
        return possibleCombination;
    }

//    AnagramReader reader = new AnagramReader();
//    //List<String> wordToCheck = Arrays.asList("d", "o", "c", "u", "m", "e", "n", "t", "i", "n", "g");
//    String wordToCheck = "documenting";
//    List<String> listOfWords = new FileReader().asStream("exercise10/anagram-words.txt")
//            .map(word -> word.split(" "))
//            .flatMap(Stream::of)
//            .filter(e -> !e.isEmpty())
//            .collect(Collectors.toList());

//    public Set<String> checkAnagram(String word) {
//        Set<String> anagram = new HashSet<>();
//        return anagram;
//    }
}
