package Week8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KeywordFinderTest {
    private KeywordFinder keywordFinder = new KeywordFinder();
    private String  elegant = "The elephant is lifted eleven floors easily with the help of an electricity elevator";
    private String playful = "The rightful heir of the powerful king had an awful accident playing with a colorful bear";
    @Test
    void findElegeant() {
        List<String> expected = Arrays.asList("elephant", "eleven", "electricity", "elevator");
        List<String > actuell = keywordFinder.findElegeant(elegant);
        Assertions.assertEquals(expected, actuell);
    }

    @Test
    void findPlayful() {
        List<String > expected = Arrays.asList("rightful", "powerful", "awful", "colorful");
        List<String > actuell = keywordFinder.findPlayful(playful);
        Assertions.assertEquals(expected, actuell);
    }
}