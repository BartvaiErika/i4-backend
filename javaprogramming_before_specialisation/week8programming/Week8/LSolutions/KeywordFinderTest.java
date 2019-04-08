package Week8.LSolutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class KeywordFinderTest {

    private KeywordFinder finder = new KeywordFinder();

    @Test
    void findElectric() {
        String text = "The elephant is lifted eleven floors easily with the help of an electricity elevator";
        List<String> found = finder.findElectric(text);
        List<String> expected = Arrays.asList("elephant", "eleven", "electricity", "elevator");
        Assertions.assertEquals(expected, found);
    }

    @Test
    void findPlayful() {
        String text = "The rightful heir of the powerful king had an awful accident playing with a colorful bear";
        List<String> found = finder.findPlayful(text);
        List<String> expected = Arrays.asList("rightful", "powerful", "awful", "colorful");
        Assertions.assertEquals(expected, found);
    }
}
