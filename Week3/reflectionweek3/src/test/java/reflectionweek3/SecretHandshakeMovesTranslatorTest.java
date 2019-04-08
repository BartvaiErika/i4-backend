package reflectionweek3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SecretHandshakeMovesTranslatorTest {

    @Autowired
    SecretHandshakeMovesTranslator secretHandshakeMovesTranslator;

    @ParameterizedTest
    @CsvSource({
            "2,thumb touches back",
            "3,little finger grab",
            "5,tickles over palm",
            "6,bro knock",
            "9,thousand knuckles"
    })
    void testIndividualHandshake(Integer number, String expected) {
        List<String> actualHandShakes = secretHandshakeMovesTranslator.translate(number);
        String collect = actualHandShakes.stream().collect(Collectors.joining());
        System.out.println(actualHandShakes);
        assertEquals(expected, collect);
    }

    @Test
    void testNoHandshake() {
        List<String> actual = secretHandshakeMovesTranslator.translate(3);
        assertTrue(actual.isEmpty());
    }
}