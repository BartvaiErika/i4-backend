package excercise8rockscissorspaper.logic.player;

import excercise8rockscissorspaper.domain.Move;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Random;

@RequiredArgsConstructor
public class ComputerPlayer implements Player {

    private final List<Move> moves;

    private Random random = new Random();

    @Override
    public Move choose() {
        int numberOfMoves = moves.size();
        int position = random.nextInt(numberOfMoves);
        return moves.get(position);
    }

    @Override
    public boolean wantsToPlayAgain() {
        return true;
    }
}