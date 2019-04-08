package week7programming.excercise4week7;

import java.util.List;
import java.util.Scanner;

public class NumberFormerApplication {
    public static void main(String[] args) {
        System.out.println("Please give me your number!");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        NumberFormer numberFormer = new NumberFormer();
        List<String> separatedNumbers = numberFormer.formNumber(number);
        System.out.println("Input: " + number);
        System.out.println("Onput: " + separatedNumbers);
    }
}
