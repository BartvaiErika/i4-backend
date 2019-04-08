package week7programming.excercise5week7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Palindrom {
    public Boolean checkPalindrom (String word) {
        String[] separated = word.split("");
        List<String> separatedWords = Arrays.asList(separated);
        for (int position = 0; position < separatedWords.size(); position++) {
            String partOfWord = separatedWords.get(position);
            if (partOfWord.equals(" "))
                separatedWords.remove(position);
        }
        word = "";
        for (String separatedWord: separatedWords) {
            word = word+separatedWord;
        }
        List<String> reversedSeparatedWords = separatedWords;
        Collections.reverse(reversedSeparatedWords);
        String reversedWord = "";
        for (String reversedSeparatedWord: reversedSeparatedWords) {
            reversedWord = reversedWord + reversedSeparatedWord;
        }
        if (word.equals(reversedWord))
          return true;
        else return false;
    }
}
