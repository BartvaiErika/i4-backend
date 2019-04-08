package week6programming.excercise5week6;

import java.util.Scanner;

public class CreditApplication {
    public static void main(String[] args) {
        System.out.println("Please give me your creditcard!");
        Long cardNumber =0000000000000000000000000000000L;
        Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLong())
                cardNumber = scanner.nextLong();
            else {
                throw new StringIndexOutOfBoundsException("Only numbers are allowed! Your card is INVALID!");
            }
        Credit credit = new Credit();
        credit.credit(cardNumber);
        String cardNumberAsString = cardNumber.toString();
        System.out.println("Your card " + cardNumber + " is " + credit.credit(cardNumber) + ".");
        LuhnAlgorithmus luhnAlgorithmus = new LuhnAlgorithmus();
        if (luhnAlgorithmus.legitimate(cardNumberAsString))
            System.out.println("Your cardnumber " + cardNumber + " is legitim.");
        else
            System.out.println("Your cardnumber " + cardNumber + " is NOT legitim.");
    }
}
