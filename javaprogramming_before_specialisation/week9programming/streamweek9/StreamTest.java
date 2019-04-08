package week9programming.streamweek9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import week9programming.streamweek9.Stream;

import java.util.Arrays;
import java.util.List;

class StreamTest {
    Stream stream = new Stream();

    @Test
    void shorterThanFour() {
        List <String> expected = Arrays.asList("El");
        List <String>  actuel = stream.shorterThanFour();
        Assertions.assertEquals(expected,actuel);
    }

    @Test
    void namesEndsWithM() {
        List <String> expected = Arrays.asList("HOSAM","TAMMAM");
        List <String> actuel = stream.namesEndsWithM();

        Assertions.assertEquals(expected,actuel);
    }

    @Test
    void namesWithEOrR() {
        List <String> expected = Arrays.asList("Mehran", "Norbert", "Serife");
        List <String> actuel = stream.namesWithEOrR();
        Assertions.assertEquals(expected,actuel);
    }

    @Test
    void namesFourLetters() {
        List <String> expected = Arrays.asList("maarj", "aamin", "omaar");
        List <String> actuel = stream.namesFourLetters();
        Assertions.assertEquals(expected,actuel);
    }

//    @Test
//    void namesFourLetters() {
//        List <String> expected = Arrays.asList("maarj", "aamin", "omaar");
//        List <String> actuel = stream.namesFourLetters();
//        System.out.println(stream.namesFourLetters());
//        Assertions.assertEquals(expected,actuel);
//    }
}