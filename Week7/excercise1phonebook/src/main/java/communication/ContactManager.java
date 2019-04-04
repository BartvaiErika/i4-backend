package communication;

import domain.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.ContactRepository;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ContactManager {

    private final ContactRepository contactRepository;

    List<Contact> findLike(String address) {
        return contactRepository.findContactsByAddressIsLike(address);
    }

    Contact save (Contact contact ) {
        return contactRepository.save(contact);
    }

    List<Contact> findAll() {
        return contactRepository.findAll();
    }
}
