package week6programming.excercise2weeek6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IceCreamTest {

    public IceCream cup = new CupIceCream("Vanilla", "Cookies");
    public IceCream cone = new ConeIceCream("Chocolate", "Oreo");

    @Test
    public void testEatCup() {
        //Assertions.assertNull(cup.getFlavor(), "No flavor of cup.");
        //Assertions.assertNull(cone.getFlavor(), "No flavor of cone.");
        //Assertions.assertTrue((cup.getFlavor().equals("Vanilla")) || (cup.getFlavor().equals("Chocolate")), "Cup: Correct flavor.");
        //Assertions.assertTrue((cone.getFlavor().equals("Vanilla")) || (cone.getFlavor().equals("Chocolate")), "Cone: Correct flavor.");
        String toppingCup = cup.getTopping();
        String flavorCup = cup.getFlavor();
        Assertions.assertEquals("The Chocolate ice-cream with Oreo is licked", cup.eat(flavorCup,toppingCup));
    }

    @Test
    public void testEatCone() {
        String flavorCone = cone.getFlavor();
        String toppingCone = cone.getTopping();
        Assertions.assertEquals("The Vanilla ice-cream with Cookies is eaten with a spoon",cone.eat(flavorCone, toppingCone));
        //Assertions.assertNull(cup.getTopping(), "No topping of cup.");
        //Assertions.assertNull(cone.getTopping(), "No topping of cone.");
        //Assertions.assertTrue((cup.getTopping().equals("Oreo")) || (cup.getTopping().equals("Cookies")), "Cup with correct topping.");
        //Assertions.assertTrue((cone.getTopping().equals("Oreo")) || (cone.getTopping().equals("Cookies")),  "Cone with correct topping.");
    }
}
