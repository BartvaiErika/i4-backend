package week3programming.excercises3week3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberCorrectorTest {
    @Test
    void testCorrectSmallerBreakage() {
        NumberCorrector numberCorrector = new NumberCorrector();
        Integer actual = numberCorrector.correct(2.25);
        Integer expected = 2;
        Assertions.assertEquals(expected, actual, "Original value 2.25");
    }
    @Test
    void testCorrectZero() {
        NumberCorrector numberCorrector = new NumberCorrector();
        Integer actual = numberCorrector.correct(0.25);
        Integer expected = 0;
        Assertions.assertEquals(expected, actual, "Original value 0,25");
    }

    @Test
    void testCorrectNegativ() {
        NumberCorrector numberCorrector = new NumberCorrector();
        Integer actual = numberCorrector.correct(-1.25);
        Integer expected = 0;
        Assertions.assertEquals(expected, actual, "Negativ value.");
    }

    @Test
    void testCorrectBiggerBreakage() {
    NumberCorrector numberCorrector = new NumberCorrector();
    Integer actual = numberCorrector.correct(1.75);
    Integer expected = 1;
    Assertions.assertEquals(expected,actual,"Original value 1.75");
    }
}