package week10programming.Sms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class SmsSummerizerTest {
    SmsSummerizer smsSummerizer = new SmsSummerizer();

    @Test
    void getRation() {
        String actuell = smsSummerizer.getRation();
        String expected = "Ham/spam ratio: ham 86 %";
        Assertions.assertEquals(expected, actuell);
    }

    @Test
    void longestSpam() {
        Integer actuell = smsSummerizer.longestSpam().get();
        Integer expected = 224;
        Assertions.assertEquals(expected, actuell);
    }

    @Test
    void getMostUsedHamWord() {
        String actuell = smsSummerizer.getMostUsedHamWord();
        String expected = "Most used ham word: to";
        Assertions.assertEquals(expected, actuell);
    }

    @Test
    void getMostUsedHamLetter() {
        String actuell = smsSummerizer.getMostUsedHamLetter();
        String expected = "Most used ham letter: e";
        Assertions.assertEquals(expected, actuell);
    }
}