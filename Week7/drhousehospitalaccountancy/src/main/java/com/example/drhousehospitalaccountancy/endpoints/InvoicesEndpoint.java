package com.example.drhousehospitalaccountancy.endpoints;

import com.example.drhousehospitalaccountancy.domain.Invoice;
import com.example.drhousehospitalaccountancy.domain.Kind;
import com.example.drhousehospitalaccountancy.domain.Patient;
import com.example.drhousehospitalaccountancy.logic.Accountant;
import com.example.drhousehospitalaccountancy.logic.InvoiceManager;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/invoices")
public class InvoicesEndpoint {

    private final Accountant accountant;
    private final InvoiceManager invoiceManager;

    //Calculates the cost of the treatment or medicine
    @PutMapping("/invoices/{id}/cost")
    public void calculateCostsOfServices(@PathVariable long id, @PathVariable Kind kind) {
        accountant.calculateCosts(id, kind);
    }

//  Creates an Invoice and stores it in the database
    @GetMapping
    public Invoice createInvoice(Patient patient) {
        String id = patient.getUuid();
        return invoiceManager.createNewInvoice(id);
    }

//   GET to /invoices -> returns all available Invoices.
    @GetMapping
    public List <Invoice> getAllAvailableInvoices () {
        return accountant.findAll();
    }

//  PUT to /invoices/{id}/paid -> sets the Invoice with id as paid.
    @PutMapping("/invoices/{id}/paid")
    public void setInvoicePaid(@PathVariable long id) {
        accountant.bookInvoicePaid(id);
    }
}
