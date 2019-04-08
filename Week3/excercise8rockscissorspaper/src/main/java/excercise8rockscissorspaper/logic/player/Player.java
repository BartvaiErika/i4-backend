package excercise8rockscissorspaper.logic.player;

import excercise8rockscissorspaper.domain.Move;

public interface Player {

    Move choose();

    boolean wantsToPlayAgain();

}