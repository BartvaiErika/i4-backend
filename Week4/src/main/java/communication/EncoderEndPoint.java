package communication;

import domain.Morse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

public class EncoderEndPoint {

    @RestController
    @RequiredArgsConstructor
    @RequestMapping("/encode")

    private final Client morseclient;
    private final Morse morse;
    private Map<String, String> morsesymbols;

    @GetMapping
    public Map symbols() {
        return morsesymbols;
    }

    @PutMapping
    String translate(@RequestBody String code) {
        return morse.getMorseCode(code);
    }
}
