package week7programming.excercise4week7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class NumberFormerApplicationTest {
    private NumberFormer numberFormer = new NumberFormer();
    @Test
    void formNumberTest() {
      List<String> actuell = numberFormer.formNumber(1234567);
      List<String> expected = Arrays.asList("1","2","3", "4", "5", "6", "7");
      Assertions.assertEquals(expected, actuell);
    }
}