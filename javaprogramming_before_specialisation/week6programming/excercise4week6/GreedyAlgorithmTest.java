package week6programming.excercise4week6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GreedyAlgorithmTest {

//    Create the GreedyAlgorithmTest class that checks at least the following cases:
//    The amount given is zero, then the change list should be empty.
//    The amount given is 88, then the change list should contain 6 coins.
//    The amount given is 149, then the change list should contain 7 coins.

    @Test
    public void testchange149 () {
        GreedyAlgorithm greedyAlgorithm = new GreedyAlgorithm();
        List<Money> actuel = greedyAlgorithm.change(149);
        Integer actuelSize = actuel.size();
        Cent50 cent50 = new Cent50();
        Cent20 cent20 = new Cent20();
        Cent5 cent5 = new Cent5();
        Cent2 cent2 = new Cent2();
        List<Money> expected = Arrays.asList(cent50,cent50,cent20,cent20,cent5,cent2,cent2);
        Integer excpectedSize = expected.size();
        Assertions.assertEquals(excpectedSize,actuelSize,"149 OK!");
    }

    @Test
    public void testchange88 () {
        GreedyAlgorithm greedyAlgorithm = new GreedyAlgorithm();
        List<Money> actuel = greedyAlgorithm.change(88);
        String actuelString = actuel.toString();
        Integer actuelSize = actuel.size();
        Cent50 cent50 = new Cent50();
        Cent20 cent20 = new Cent20();
        Cent10 cent10 = new Cent10();
        Cent5 cent5 = new Cent5();
        Cent2 cent2 = new Cent2();
        List<Money> expected = Arrays.asList(cent50,cent20,cent10,cent5,cent2,cent2);
        String expectedString = expected.toString();
        Integer excpectedSize = expected.size();
        Assertions.assertEquals(excpectedSize,actuelSize, "88 OK!");
        //Assertions.assertEquals(expectedString,actuelString,"HAHA");
    }

    @Test
    public void testchangezero () {
        GreedyAlgorithm greedyAlgorithm = new GreedyAlgorithm();
        List<Money> actuel = greedyAlgorithm.change(0);
        List<Money> expected = Arrays.asList();
        Assertions.assertEquals(expected, actuel, "Alles OK!");
    }
}


