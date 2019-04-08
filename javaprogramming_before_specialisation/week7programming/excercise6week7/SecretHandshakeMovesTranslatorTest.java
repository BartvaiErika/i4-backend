package week7programming.excercise6week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SecretHandshakeMovesTranslatorTest {

    private SecretHandshakeMovesTranslator secretHandshakeMovesTranslator = new SecretHandshakeMovesTranslator();

    @Test
    void translateIntoSecretHandshakeMoves() {
        Integer number =2569;
        List<String> actuell = new ArrayList<>();
        List<Integer> digits = secretHandshakeMovesTranslator.separate(number);
        System.out.println(digits);
        for (Integer digit : digits) {
            if (secretHandshakeMovesTranslator.isHandshake(digit)) {
                String handshake = secretHandshakeMovesTranslator.getHandshake(digit);
                actuell.add(handshake);
            }
        }
        //List<String> actuell =secretHandshakeMovesTranslator.translateIntoSecretHandshakeMoves(number);
        List<String> expected = Arrays.asList("Thumb touches back","Thickles over palm","Bro knock","Thousend knuckles");
        Assertions.assertEquals(expected,actuell);
    }

}