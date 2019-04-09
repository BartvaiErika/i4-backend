package com.example.phone_book_new.persistence.repository;

import com.example.phone_book_new.persistence.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    List<Contact> findByAddressNameIsLike(String address);
}
