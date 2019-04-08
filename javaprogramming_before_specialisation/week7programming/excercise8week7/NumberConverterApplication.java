package week7programming.excercise8week7;

import java.util.Scanner;

public class NumberConverterApplication {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        RoemerNumberValidator roemerNumberValidator = new RoemerNumberValidator();
        NumberConverter numberConverter = new NumberConverter();
        RoemerNumberConverter roemerNumberConverter = new RoemerNumberConverter();
        System.out.println("Choose an option: ");
        System.out.println(menu.Menu());
        Integer choise = scanner.nextInt();
        System.out.println(menu.Menu().get(1));
        if (choise.equals(1)) {
            System.out.println("Give me your number! ");
            if (scanner.hasNextInt()) {
                Integer number = scanner.nextInt();
                String roman = numberConverter.convertArabictoRoman(number);
                System.out.println("From " + number + "into roman number " + roman + " converted.");
            }
        }
        if (choise.equals(2)) {
            System.out.println("Give me your number! Your options are: I, V, X, L, C, D, M");
            String roemerNumber = scanner.next();
            if (!roemerNumber.equals("")) {
                if (roemerNumberValidator.validate(roemerNumber)) {
                    Integer arabicNumber = roemerNumberConverter.convertRomanNumberToArabic(roemerNumber);
                    System.out.println("From roman " + roemerNumber  + "into arabic number " + arabicNumber + " converted.");
                }
                else
                    System.out.println("Sorry your roman number is not valid!");
            }
        }
        if (choise.equals(3)) System.out.println("-- Goodbye.");
    }
}
