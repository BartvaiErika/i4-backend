package week6programming.excercise2weeek6;

public class IceCreamApplication {

    public static void main(String[] args) {

        String flavor = "Chocolate";
        String topping = "Oreo";
        IceCream cup = new CupIceCream(flavor, topping);
        IceCream cone = new ConeIceCream(flavor, topping);
        System.out.println(cone.eat(cone.getFlavor(),cone.getTopping()));
        System.out.println(cup.eat(cup.getFlavor(),cup.getTopping()));

    }
}
