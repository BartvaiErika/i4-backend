package communication;

import domain.Contact;
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


