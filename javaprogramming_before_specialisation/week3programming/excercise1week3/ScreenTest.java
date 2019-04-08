package week3programming.excercise1week3;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class ScreenTest {
    Screen screen = new Screen();

    @Test
    void testBusinessCustomer() {
        Customer customer = new Customer("Erika", "business");
        String name = screen.display(customer);
        String expected = customer.getName();
        Assertions.assertEquals(expected, name,"Business category is OK!");
    }

    @Test
    void testEconomicCustomer() {
        Customer customer = new Customer("Erika2", "economic");
        String name = screen.display(customer);
        String expected = customer.getName();
        Assertions.assertEquals(expected, name, "Economic category is OK!");
    }
    @Test
    void testOtherCustomer() {
        Customer customer1 = new Customer("Erika3", "");
        String name1 = screen.display(customer1);
        String expected = customer1.getName();
        Assertions.assertEquals(expected, name1,"Empty category is OK.");
        Customer customer2 = new Customer("Erika4", "some other string");
        String name2 = screen.display(customer2);
        Assertions.assertEquals(expected, name1,"Other string is OK");
        Customer customer3 = new Customer("Erika5",null);
        String name3 = screen.display(customer3);
        Assertions.assertEquals(expected , name3 ,"Null category is OK.");
    }
}



