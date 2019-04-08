package week6programming.excercise2weeek6.competitor;

import week6programming.excercise2weeek6.ConeIceCream;
import week6programming.excercise2weeek6.CupIceCream;
import week6programming.excercise2weeek6.IceCream;

public class CompetitorIceCreamApplication {
    public static void main(String[] args) {

        String flavor = "Chocolate";
        String topping = "Oreo";
        IceCream cup = new CupIceCream(flavor, topping);
        IceCream cone = new ConeIceCream(flavor, topping);

        System.out.println(((ConeIceCream) cone).eat(cone.getFlavor(),cone.getFlavor()));
        System.out.println(((CupIceCream)cup).eat(cup.getFlavor(),cup.getTopping()));

    }
}
