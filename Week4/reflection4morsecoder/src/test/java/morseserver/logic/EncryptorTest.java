package morseserver.logic;

import lombok.extern.java.Log;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Map;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@Log
@SpringBootTest(webEnvironment = NONE)
class EncryptorTest {
    @Autowired
    Encryptor encryptor;

    @ParameterizedTest
    @CsvSource({
            "A,. _",
            "a,. _",
            "B,_ . . .",
            "0,_ _ _ _ _"
    })
    public void encryptTheLetter(String planText, String encrypted) {
        String actual = encryptor.encryptTheLetter(planText);

        Assertions.assertThat(actual).isEqualTo(encrypted);
    }

    @Test
    void getMorseChart() {
        Map<String, String> actual = encryptor.getMorseChart();
        log.severe("chart: "+ actual.entrySet());

        Assertions.assertThat(actual.size()).isEqualTo(4);
        Assertions.assertThat(actual).containsKeys("A","B","1","0");
    }
}