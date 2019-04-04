package communication;

import domain.Address;
import domain.Contact;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import repository.ContactRepository;

import java.util.List;

import static org.junit.Assert.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@SpringBootTest(webEnvironment = NONE)

public class ContactManagerTest {

    @Autowired
    ContactRepository contactRepository;

    @Autowired
    Contact contact;

    @Autowired
    ContactManager contactManager;

    @Autowired
    Address address;

    @Before
    public void setUp() throws Exception {
        contactRepository.deleteAll();
    }

    @Test
    public void findAll() {
        List<Contact> actual = contactManager.findAll();
        assertNotNull(actual);
        Assertions.assertThat(actual).isNotEmpty();
    }
    @Test
    public void findLike() {
        List <Contact> actualContacts = contactManager.findLike(contact.getAsdress().equals("123");
        Contact actualContact = actualContacts.get(1);
        Assertions.assertThat(actualContact.getAsdress()).isSameAs(contact.getAsdress());
    }

    @Test
    public void save() {
        List <Contact> actual = contactManager.save(contact.getId(Long.valueOf("1234567890"),
                contact.setName("TestName"), contact.setAsdress(address.setId(Long.valueOf("123")));
        //assertThat(actual.);
    }


}