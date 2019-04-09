package com.example.phone_book_new.communication;

import com.example.phone_book_new.persistence.domain.Contact;
import com.example.phone_book_new.persistence.repository.ContactRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class ContactEndpointTest {

    @Autowired
    ContactRepository contactRepository;

    @Autowired
    List<Contact> contacts;

    @BeforeEach
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