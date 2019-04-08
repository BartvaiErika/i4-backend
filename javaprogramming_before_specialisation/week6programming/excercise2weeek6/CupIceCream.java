package week6programming.excercise2weeek6;

public class CupIceCream extends IceCream {

    String flavor = "Vanilla";
    String topping = "Cookies";

    public CupIceCream(String flavor, String topping) {
        super(flavor, topping);
    }

    @Override
    public String eat(String getFlavor, String getTopping) {
        return "The " + flavor + " ice-cream with " + topping + " is licked";
    }
}
