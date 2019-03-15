package morseserver;

import lombok.RequiredArgsConstructor;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RequiredArgsConstructor
public class MorseEncoder {
    private final Loader loader;

    public String translate (String message) {
        Map<String,String> loadMorse = loader.getMessage();

        return Stream.of(message.split(""))
                .filter(e->!e.equals(" "))
                .filter(loadMorse:: containsKey)
                .map(e->e.toLowerCase())
                .map(loadMorse::get)
                .collect(Collectors.joining());
    }

}
