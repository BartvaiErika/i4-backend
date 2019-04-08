package week5programming.excercise7week5;

import java.util.Scanner;

public class MainMenu {
    private Scanner scanner = new Scanner(System.in);
    private GameMenu gameMenu = new GameMenu();

    public void displayMainMenu(){
        gameMenu.displayMenu();
        System.out.println("Do you want to play again? (yes/no)");
        String answer = scanner.nextLine();
        while(answer.equalsIgnoreCase("yes")){
            gameMenu.displayMenu();
            System.out.println("Do you want to play again? (yes/no)");
            answer = scanner.nextLine();
        }
        System.out.println("See you next time!");

    }
}