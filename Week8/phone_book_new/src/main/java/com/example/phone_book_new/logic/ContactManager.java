package com.example.phone_book_new.logic;

import com.example.phone_book_new.persistence.domain.Contact;
import com.example.phone_book_new.persistence.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactManager {

    private final ContactRepository contactRepository;

    public List<Contact> findAll() {
        return contactRepository.findAll();
    }

    public Contact save (Contact contact ) {
        return contactRepository.save(contact);
    }

    public List<Contact> findLike(String address) {
        String addresssName = "%" + address + "%";
        return contactRepository.findByAddressNameIsLike(addresssName);
    }

}
