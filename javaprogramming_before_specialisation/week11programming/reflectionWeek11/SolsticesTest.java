package week11programming.reflectionWeek11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


class SolsticesTest {
    Solstices solstices = new Solstices();

    @Test
    void getSummerSolsticeCountdown() {
        String actuell= solstices.getSummerSolsticeCountdown(LocalDate.of(01,02,2019));
        String expected = "The Summer Solstice 2919 is on 21.06.19, (in 140 days).";
        Assertions.assertEquals(expected, actuell);
    }

    @Test
    void getWinterSolsticeCountdown() {
        String actuell= solstices.getSummerSolsticeCountdown(LocalDate.of(01,02,2019));
        String expected = "The Winter Solstice 2919 is on 22.12.2019, (in 311 days).";
        Assertions.assertEquals(expected, actuell);
    }

}