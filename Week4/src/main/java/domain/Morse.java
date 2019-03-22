package domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Morse {
    private String morseCode;
    private String symbol;
}
