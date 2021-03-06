package repository;

import domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface  ContactRepository extends JpaRepository<Contact, Long>  {
    List<Contact> findContactsByAddressIsLike (String address);
}
