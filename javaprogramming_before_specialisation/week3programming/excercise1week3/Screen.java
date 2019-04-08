//Created by Erika

package week3programming.excercise1week3;

public class Screen {

    public String display(Customer customer) {
        if (customer.getCategory().equals("business")) {
            System.out.println(customer.getName().toUpperCase());
            return customer.getName().toUpperCase();
        }
        else {
            System.out.println(customer.getName().toLowerCase());
            return customer.getName().toLowerCase();
        }
    }
}

