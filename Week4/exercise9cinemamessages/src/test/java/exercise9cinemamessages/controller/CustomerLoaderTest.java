package exercise9cinemamessages.controller;

import exercise9cinemamessages.model.Customer;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class CustomerLoaderTest {

    @Autowired
    CustomerLoader loader;

    @Test
    void getCustomer() {
        List<Customer> customers = loader.getCustomer();
        int expected = 22;
        Assertions.assertEquals(expected, customers.size());
    }
}