package morseserver;

import com.example.reflection4morsecoder.Morseclient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/morse")
@RequiredArgsConstructor
public class MorseEndpoint {

    MorseEncoder morseEncoder;

    @PostMapping
    public String encode (@RequestBody String letter) {
        return morseEncoder.translate(letter);
    }
}
