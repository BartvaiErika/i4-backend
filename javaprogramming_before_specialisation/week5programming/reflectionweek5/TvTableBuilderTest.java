package week5programming.reflectionweek5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

public class TvTableBuilderTest {

    private TvTableBuilder tvTableBuilder = new TvTableBuilder();

    @Test
    void WardrobeBuilderTest() {
        String parts = "leg, leg, leg, leg, shelf, top)";
        String [] steps = parts.split(";");
        TvTable tvTable = tvTableBuilder.build();
        List<String> tvTableParts = tvTable.getParts();
        Assertions.assertEquals(steps, tvTableParts);
    }
}
