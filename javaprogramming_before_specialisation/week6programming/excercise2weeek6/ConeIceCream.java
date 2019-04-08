package week6programming.excercise2weeek6;

public class ConeIceCream extends IceCream {

    private String flavor = "Chocolate";
    private String topping = "Oreo";

    public ConeIceCream(String flavor, String topping) {
        super(flavor, topping);
    }

    @Override
    public String eat(String getFlavor, String getTopping) {
        return "The " + flavor + " ice-cream with " + topping + " is eaten with a spoon";
    }
}
