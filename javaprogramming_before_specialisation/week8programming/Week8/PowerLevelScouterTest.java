package Week8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PowerLevelScouterTest {

    PowerLevelScouter powerLevelScouter = new PowerLevelScouter();
    @Test
    void scout() {
        String name = "Susana";
        Integer actuell = powerLevelScouter.scout(name );
        Integer expected = 619;
        Assertions.assertEquals(expected , actuell);
    }

    @Test
    void enhancedScout() {
        String name = "susana";
        Integer actuell = powerLevelScouter.enhancedScout(name);
        Integer expected = 651;
        Assertions.assertEquals(expected , actuell);
    }
}