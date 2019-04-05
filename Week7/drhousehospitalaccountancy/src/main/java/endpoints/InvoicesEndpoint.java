package endpoints;

import domain.Invoice;
import domain.Patient;
import logic.Accountant;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/invoices")
public class InvoicesEndpoint {

    private final Accountant accountant;

    //Calculates the cost of the treatment or medicine
    @PutMapping("/invoices/{id}/cost")
    Invoice setInvoicePaid(@PathVariable long id) {
        return accountant.calculateCosts(id);
    }

    //Creates an Invoice and stores it in the database
    @GetMapping
    Invoice createInvoice(Patient patient) {
        return accountant.createNewInvoice(patient);
    }

//    GET to /invoices -> returns all available Invoices.
    @GetMapping
    List <Invoice> getAllAvailableInvoices () {
        return accountant.findAll();
    }
//    PUT to /invoices/{id}/paid -> sets the Invoice with id as paid.
    @PutMapping("/invoices/{id}/paid")
    Invoice setInvoicePaid(@PathVariable long id) {
        return accountant.bookInvoicePaid(id);
    }
}
