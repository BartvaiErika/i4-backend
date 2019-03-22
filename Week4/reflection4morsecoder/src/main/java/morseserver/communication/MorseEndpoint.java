package morseserver.communication;

import lombok.RequiredArgsConstructor;
import morseserver.MorseEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/morse")
@RequiredArgsConstructor

public class MorseEndpoint {

    private final MorseEncoder morseEncoder;

    @PostMapping("/morse")
    public String encode (@RequestBody String letter) {
        return morseEncoder.translate(letter);
    }
}
