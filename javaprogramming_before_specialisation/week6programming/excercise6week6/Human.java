package week6programming.excercise6week6;

import java.util.Optional;
import java.util.Scanner;

public class Human implements Player {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public Move choose() {
        Optional<Move> move = Optional.empty();
        while (!move.isPresent()) {
            move = ask();
        }
        return move.get();
    }

    private Optional<Move> ask() {
        System.out.println("These are your options: "+Moves.asString());
        String moveName = scanner.nextLine();
        return Moves.get(moveName);
    }

    @Override
    public boolean wantsToPlayAgain() {
        System.out.println("Do you want to play again? (yes,no)");
        String answer = scanner.nextLine();
        return "yes".equalsIgnoreCase(answer);
    }
}