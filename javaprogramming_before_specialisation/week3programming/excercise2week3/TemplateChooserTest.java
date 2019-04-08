package week3programming.excercise2week3;

import week3programming.excercise1week3.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class TemplateChooserTest {
    TemplateChooser templateChooser = new TemplateChooser();

    @Test
    void testManTemplate() {
        Customer customer = new Customer("Mr.Miller","business");
        String actual = templateChooser.chooseTemplate(customer);
        String expected = "man";
        Assertions.assertEquals(expected,actual,"ManTemplate is OK.");
    }
    @Test
    void testWomanTemplate() {
        Customer  customer = new Customer("Mrs.Miller","business");
        String actual = templateChooser.chooseTemplate(customer);
        String expected = "woman";
        Assertions.assertEquals(expected,actual,"WomanTemplate is OK");
    }
    @Test
    void testPrivilegedTemplate() {
        Customer customer = new Customer("Mr.Hokopoko","economic");
        String actual = templateChooser.chooseTemplate(customer);
        String expected = "privileged";
        Assertions.assertEquals(expected,actual,"Privileged template is OK.");
    }
    @Test
    void testDefaultTemplate() {
        Customer customer = new Customer("Mrs.Erika","economic");
        String actual = templateChooser.chooseTemplate(customer);
        String expected = "woman";
        Assertions.assertEquals(expected,actual,"Default template is OK. Default template is woman.");
    }
    @Test
    void testEmptyTemplate() {
        Customer customer = new Customer("","economic");
        String actual = templateChooser.chooseTemplate(customer);
        String expected = "";
        Assertions.assertEquals(expected,actual,"No name is available!");
    }
}
