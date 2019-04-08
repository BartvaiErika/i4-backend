//Created by Erika
package week3programming.excercise2week3;

import week3programming.excercise1week3.Customer;

public class TemplateChooser {
    public String chooseTemplate (Customer customer) {
        if (customer.getName().isEmpty()) {
            System.out.println("Error: No name exists! ");
            return "";
        }
        if (customer.getName().contains("Hokopoko") ) return "privileged";
        else if (customer.getName().startsWith("Mr."))
            return "man";
        else return "woman";
    }
}
