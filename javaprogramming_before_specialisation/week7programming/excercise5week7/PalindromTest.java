package week7programming.excercise5week7;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class PalindromTest {
    private Palindrom palindrom = new Palindrom();
    @Test
    void checkPalindromTest() {
        String word = "madam";
        Boolean expected = true;
        Boolean actuell= palindrom.checkPalindrom(word);
        Assertions.assertEquals(expected,actuell);
    }

}