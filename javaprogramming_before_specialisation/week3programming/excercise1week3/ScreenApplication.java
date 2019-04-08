//Created by Erika

package week3programming.excercise1week3;

public class ScreenApplication {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Customer business = new Customer("Mueller", "economic");
        Customer economic = new Customer("Fischer", "business");
        screen.display(economic);
        screen .display(business);

    }
}
