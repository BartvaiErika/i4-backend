package excercise8rockscissorspaper.configuration;

import excercise8rockscissorspaper.domain.Move;
import excercise8rockscissorspaper.logic.Moves;
import excercise8rockscissorspaper.logic.player.ComputerPlayer;
import excercise8rockscissorspaper.logic.player.HumanPlayer;
import excercise8rockscissorspaper.logic.player.Player;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PlayerConfiguration {

    @Bean
    Player human(Moves moves) {
        return new HumanPlayer(moves);
    }

    @Bean
    Player computer(List<Move> moves) {
        return new ComputerPlayer(moves);
    }

}
