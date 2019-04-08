//Created by Erika

package week3programming.excercise2week3;

import week3programming.excercise1week3.Customer;

public class InsuranceApplication {
    public static void main(String[] args) {
        Customer customer = new Customer("Mr.Miller","economic");
        TemplateChooser templateChooser = new TemplateChooser();
        System.out.println(templateChooser.chooseTemplate(customer));


    }
}
