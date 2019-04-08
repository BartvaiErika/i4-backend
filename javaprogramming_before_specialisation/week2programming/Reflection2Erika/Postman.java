package week2programming.Reflection2Erika;

import java.util.List;

public class Postman {

    private List<Letter> letters;

    public Postman(List<Letter> letters) {
        this.letters = letters;
    }

    public void deliver() {
        while (thereAreLetters()) {
            deliverOneLetter();
        }
    }

    private boolean thereAreLetters() {
        return !letters.isEmpty();
    }

    private void deliverOneLetter() {
        Letter letter = letters.get(0);
        letters.remove(0);
        System.out.println("Letter delivered to: " + letter.getAddress());
    }
}