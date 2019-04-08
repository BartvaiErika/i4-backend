package week11programming.changeTimeToWord;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import week11programming.changeTimeToWord.ChangeTimeToWords;


class ChangeTimeToWordsTest {
    ChangeTimeToWords changeTimeToWords = new ChangeTimeToWords();

    @Test
    void toWordNoon() {
        Integer minutes= 0;
        Integer hours = 12;
        String actuell= changeTimeToWords.toWord(hours, minutes);
        String expected = " noon ";
        Assertions.assertEquals(expected, actuell);
    }

    @Test
    void toWordMidnight() {
        Integer minutes= 0;
        Integer hours = 0;
        String actuell= changeTimeToWords.toWord(minutes,hours);
        String expected = " midnight ";
        Assertions.assertEquals(expected, actuell);
    }

    @Test
    void toWordFullClock() {
        Integer minutes= 0;
        Integer hours = 9;
        String actuell= changeTimeToWords.toWord(hours, minutes);
        String expected = "nine o'clock in the morning.";
        Assertions.assertEquals(expected, actuell);
    }

    @Test
    void toWordLessThan30() {
        Integer minutes= 11;
        Integer hours = 14;
        String actuell= changeTimeToWords.toWord(hours,minutes);
        String expected = "eleven minutes past fourteen in the afternoon.";
        Assertions.assertEquals(expected, actuell);
    }

    @Test
    void toWordMoreThan30() {
        Integer minutes= 34;
        Integer hours = 8;
        String actuell= changeTimeToWords.toWord(hours, minutes);
        String expected = "twenty-six minutes to eight in the morning.";
        Assertions.assertEquals(expected, actuell);
    }


}