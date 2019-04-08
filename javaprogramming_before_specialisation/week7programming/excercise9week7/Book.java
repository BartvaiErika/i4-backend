package week7programming.excercise9week7;
import java.util.List;

public class Book {
    private String title;
    private List<String> words;

    public Book(String title, List<String> words) {
        this.title = title;
        this.words = words;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getWords() {
        return words;
    }
}



