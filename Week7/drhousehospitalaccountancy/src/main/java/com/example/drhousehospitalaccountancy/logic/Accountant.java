package com.example.drhousehospitalaccountancy.logic;

import com.example.drhousehospitalaccountancy.DTO.PatientDTO;
import com.example.drhousehospitalaccountancy.domain.Invoice;
import com.example.drhousehospitalaccountancy.domain.Kind;
import com.example.drhousehospitalaccountancy.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.drhousehospitalaccountancy.repository.InvoiceRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Accountant {

    private final InvoiceRepository invoiceRepository;
    private final PatientRepository patientRepository;
    private final PatientDTO patientDTO;

    public List<Invoice> findAll() {
        return invoiceRepository.findAll();
    }

    public Invoice bookInvoicePaid(long id) {
        Invoice paidInvoice = invoiceRepository.getOne(id);
        paidInvoice.setPaid(true);
        return paidInvoice;
    }

    public Invoice calculateCosts(Long id) {
        Invoice invoiceWithCalculatedCosts = invoiceRepository.getOne(id);
        switch(Kind)   {
            case Kind.MEDICINE:
                invoiceWithCalculatedCosts.setCost(50.00);
            break;
            case Kind.TREATMENT:
                invoiceWithCalculatedCosts.setCost(500.00);
                break;
        }
        invoiceRepository.save(invoiceWithCalculatedCosts);
        return invoiceWithCalculatedCosts;
    }

//    to make sure that the right Invoice is created when a Patient arrives
//    or both treatment and medicine cases.
//    Make sure as well that an Invoice is set to paid when requested.

}
