//package week5programming.excercise4week5;
////Create the SuperheroCallerTest class to test the call method.
////Make sure it never returns null and that the superhero names are either Batman, Superman or Spiderman.
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import week5programming.excercise5week5.Villain;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class SuperheroCallerTest {
//
//    String expected;
//    String actual;
//    @Test
//    void testCallNull() {
//        List<Superhero> superheroes = new ArrayList<Superhero>();
//        SuperheroCaller superheroCaller = new SuperheroCaller(superheroes);
//        Superhero superhero = superheroCaller.call(superheroes);
//        //Assertions.assertNotNull(superhero);
//        actual = superhero.getName();
//        if (actual.equals(null))
//            Assertions.assertEquals(null, actual, "Superhero is empty object");
//    }
//
//    void testCallSpiderman() {
////        Superhero spiderman = new Superhero() {
////            @Override
////            public String getName() {
////                return "spiderman";
////            }
////        };
////        actual = "spiderman";
////        expected = actual;
////        Assertions.assertEquals(expected, actual, "Superhero works as spiderman correct.");
////    }
////
////    void testCallSuperman() {
////        Superhero superman = new Superhero() {
////            @Override
////            public String getName() {
////                return "superman";
////            }
////        };
////        actual = "superman";
////        expected = actual;
////        Assertions.assertEquals(expected, actual, "Superhero works as superman correct.");
////    }
////
////    void testCallSuperman() {
////        Superhero batman = new Superhero() {
////            @Override
////            public String getName() {
////                return "batman";
////            }
////        };
////        actual = "batman";
////        expected = actual;
////        Assertions.assertEquals(expected, actual, "Superhero works as batman correct.");
////    }
////
//
//
//}
//
//
//
