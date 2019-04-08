package excercise8rockscissorspaper.logic.player;

import excercise8rockscissorspaper.domain.Move;
import excercise8rockscissorspaper.logic.Moves;
import lombok.RequiredArgsConstructor;

import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

@RequiredArgsConstructor
public class HumanPlayer implements Player {

    private final Moves moves;
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Move choose() {
        Optional<Move> move = Optional.empty();
        while (move.isEmpty()) {
            move = getMove();
        }
        return move.get();
    }

    private Optional<Move> getMove() {
        System.out.println("Choose your move (" + moves.asString() + "): ");
        String name = scanner.nextLine();
        return moves.from(name);
    }

    @Override
    public boolean wantsToPlayAgain() {
        System.out.println("Do you want to play again? (yes/no): ");
        String choice = scanner.next();
        return Objects.equals(choice, "yes");
    }
}