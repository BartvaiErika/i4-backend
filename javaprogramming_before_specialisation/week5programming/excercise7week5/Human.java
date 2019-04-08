package week5programming.excercise7week5;

import java.util.Scanner;

public class Human implements Player {
    @Override
    public String getName() {
        return "Player1";
    }

    @Override
    public String getChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

