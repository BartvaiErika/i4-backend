package Week8.LSolutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PowerLevelScouterTest {

    private PowerLevelScouter scouter = new PowerLevelScouter();

    @Test
    void scoutBasic() {
        String name = "Susana";
        int powerLevel = scouter.scout(name);
        Assertions.assertEquals(619, powerLevel);
    }

    @Test
    void scoutSpecial() {
        String name = "Susana";
        int powerLevel = scouter.scoutEnhanced(name);
        Assertions.assertEquals(651, powerLevel);
    }
}