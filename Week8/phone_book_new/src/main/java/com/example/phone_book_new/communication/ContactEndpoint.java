package com.example.phone_book_new.communication;

import com.example.phone_book_new.persistence.domain.Contact;
import com.example.phone_book_new.logic.ContactManager;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/contacts")

public class ContactEndpoint {

    private final ContactManager contactManager;


    @GetMapping
    List<Contact> getAll() {
        return contactManager.findAll();
    }

    @PostMapping
    Contact post(@RequestBody Contact contact) {
        return contactManager.save(contact);
    }

    @GetMapping("/address/{address}")
    List<Contact> getContactByAddress(@PathVariable String address) {
        return contactManager.findLike(address);
    }
}

