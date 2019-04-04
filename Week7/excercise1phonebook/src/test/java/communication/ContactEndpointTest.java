package communication;

import domain.Contact;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import repository.ContactRepository;

import java.util.List;

import static org.junit.Assert.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class ContactEndpointTest {

    @Autowired
    Contact contact;

    @Autowired
    ContactRepository contactRepository;

    @Autowired
    List<Contact> contacts;

    @Before
    public void setUp() throws Exception {
        contactRepository.deleteAll();
        contactRepository.saveAll(contacts);
    }

    @Test
    public void getAll() {
    }

    @Test
    public void post() {
    }

    @Test
    public void getContactByAddress() {
    }

}