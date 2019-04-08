package excercise8rockscissorspaper.configuration;

import excercise8rockscissorspaper.domain.Move;
import excercise8rockscissorspaper.logic.Game;
import excercise8rockscissorspaper.logic.Judge;
import excercise8rockscissorspaper.logic.Moves;
import excercise8rockscissorspaper.ui.Host;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Set;

@Configuration
public class GameConfiguration {

    @Bean
    Moves moves(Set<Move> moves) {
        return new Moves(moves);
    }

    @Bean
    Judge judge() {
        return new Judge();
    }

    @Bean
    Game game() {
        return new Game();
    }

    @Bean
    Host host() {
        return new Host();
    }
}