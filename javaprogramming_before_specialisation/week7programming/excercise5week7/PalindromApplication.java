package week7programming.excercise5week7;

import java.util.Scanner;

public class PalindromApplication {
    public static void main(String[] args) {
        System.out.println("Please give me your word!");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        Palindrom palindrom = new Palindrom();
        if (palindrom.checkPalindrom(word))
            System.out.println("It is a palindrom.");
        else System.out.println("It isn't palindrom.");
    }
}
