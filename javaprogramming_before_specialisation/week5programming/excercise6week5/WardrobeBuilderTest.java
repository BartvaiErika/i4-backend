package week5programming.excercise6week5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

public class WardrobeBuilderTest {
    private WardrobeBuilder wardrobeBuilder = new WardrobeBuilder();
    @Test
    void WardrobeBuilderTest() {
        String parts = "back, side, side, back, top, shelf, shelf, shelf, shelf, shelf, shelf, shelf, shelf, shelf, shelf, shelf, shelf, door, door";
        String [] steps = parts.split(";");
        Wardrobe wardrobe = wardrobeBuilder.build();
        List<String> wartdrobeParts = wardrobe.getParts();
        Assertions.assertEquals(steps, wartdrobeParts);
    }
}
