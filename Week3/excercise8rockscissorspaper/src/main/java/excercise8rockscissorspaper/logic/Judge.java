package excercise8rockscissorspaper.logic;

import excercise8rockscissorspaper.domain.Move;
import java.util.Objects;

public class Judge {

    public String judge(Move move1, Move move2) {
        if (defeats(move1, move2)) {
            return "Player 1 wins";
        }
        if (defeats(move2, move1)) {
            return "Player 2 wins";
        }
        return "Nobody wins";
    }

    private boolean defeats(Move move1, Move move2) {
        String defeats = move1.getDefeats();
        String move2Name = move2.getName();
        return Objects.equals(defeats, move2Name);
    }
}
