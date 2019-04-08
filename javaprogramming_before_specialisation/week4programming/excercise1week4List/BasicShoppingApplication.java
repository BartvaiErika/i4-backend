package week4programming.excercise1week4List;
import java.util.ArrayList;
import java.util.List;

public class BasicShoppingApplication {
    public static void main(String[] args) {
        List<String> groceries  = new ArrayList<>();
        System.out.println("Groceries list: "+ groceries);
        groceries.add("bananas");
        groceries.add("oranges");
        groceries.add("tomatoes");
        System.out.println("Groceries list with elements:" + groceries);
        String orange = "oranges";
        groceries.remove(orange);
        System.out.println("Groceries list with elements after removing organges:" + groceries);
        String tomato = "tomatoes";
        groceries.add(tomato);
        groceries.add(tomato);
        System.out.println("Groceries list with three tomatoes: "+  groceries);
        groceries.remove(tomato);
        System.out.println("Groceries list with two tomatoes: "+  groceries);
        System.out.println("Groceries size: "+  groceries.size());
}}

