//Created by Erika

package week3programming.excercise1week3;

public class Customer {
    private String name;
    private String category = "economic";

    public Customer(String name, String category) {
        this.name = name;
        this.category =category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}
