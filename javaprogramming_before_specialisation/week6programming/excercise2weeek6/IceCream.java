package week6programming.excercise2weeek6;

public abstract class IceCream {

    private String flavor;
    private String topping;

    public IceCream(String flavor, String topping) {
        this.flavor = flavor;
        this.topping = topping;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getTopping() {
        return topping;
    }

    public abstract String eat(String getFlavor, String getTopping);


}
