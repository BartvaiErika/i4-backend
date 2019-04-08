package week4programming.excercise5week4List;

import java.util.ArrayList;
import java.util.List;

public class AdvancedShoppingApplication {

    public static void main(String[] args) {
        //String name = "";
        List<Grocery> groceries  = new ArrayList<>();

        System.out.println("Groceries empty list: " + groceries);
        Grocery banana = new Grocery("banana");
        Grocery orange = new Grocery("orange");
        Grocery tomato = new Grocery("tomato");

        groceries.add(banana);
        groceries.add(orange);
        groceries.add(tomato);
        System.out.println("Groceries list with fruits: " + groceries.toString());

        groceries.add(tomato);
        groceries.add(tomato);
        System.out.println("Graceries after adding twice tomatoes: " + groceries.toString());

        for (Grocery grocery: groceries) {
            if (groceries.equals(grocery)) {
                groceries.remove(grocery);
                System.out.println("Removed grocery" + grocery);
            }
        }
        System.out.println("Graceries after removing one tomatoes: " + groceries.toString());
        System.out.println("Groceries size: " + groceries.size());
    }
}