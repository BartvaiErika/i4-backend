package trickster.src.main.java.trickster.communication.
import trickster.src.main.java.trickster.logic.Trickster;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TricksterEndpoint {

    private final Trickster trickster;

    @GetMapping("/play")
    String play() {
        trickster.startGame();
        return "The game has started!";
    }

    @GetMapping("/choose/{number}")
    boolean choose(@PathVariable int number) {
        return trickster.choose(number);
    }

}
