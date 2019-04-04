import java.util.List;

public class AliceApplication {
    public static void main(String[] args) {
        String path = "reflection/week10/alice.txt";
        BookReader bookReader = new BookReader();
        List<String> words = bookReader.getWords("file/alice.txt");
        Summarizer summarizer = new Summarizer();
        System.out.println("Number of words in the book: " + summarizer.wordsOfBook(words));
        System.out.println("Number of words in the book without repeating: " + summarizer.distinctWordsOfBook(words));
        System.out.println("Most appearing 5 words in the book: ");
        summarizer.mostAppearingWords(words).stream().forEach(System.out::println);
        System.out.println("Longest 5 words in the word: ");
        summarizer.longestWords(words).stream().forEach(System.out::println);
        System.out.println("Most appearing 5 letters in the book: ");
        summarizer.mostAppearingLetters(words).stream().forEach(System.out::println);
        System.out.println("How many times appears the word Alice: " + summarizer.aliceAppearing(words));

    }
}
