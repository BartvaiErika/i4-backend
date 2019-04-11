package com.example.drhousehospitalaccountancy.logic;

import com.example.drhousehospitalaccountancy.dto.PatientDTO;
import com.example.drhousehospitalaccountancy.domain.Invoice;
import com.example.drhousehospitalaccountancy.domain.Kind;
import com.example.drhousehospitalaccountancy.repository.PatientRepository;
import com.example.drhousehospitalaccountancy.repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.util.Comparator;

@Service
@RequiredArgsConstructor
public class Accountant {

    private InvoiceRepository invoiceRepository;
    private PatientRepository patientRepository;
    private PatientDTO patientDTO;

    public List<Invoice> findAll() {
        return invoiceRepository.findAll();
    }

    public Invoice bookInvoicePaid(long id) {
        Invoice paidInvoice = invoiceRepository.getOne(id);
        paidInvoice.setPaid(true);
        return paidInvoice;
    }

    public void calculateCosts(Long id, Kind kind) {
        Invoice invoiceWithCalculatedCosts = Optional.of(invoiceRepository.getOne(id)).orElse(null);
        switch(kind)   {
            case MEDICINE:
                invoiceWithCalculatedCosts.setCost(49.99);
            break;
            case TREATMENT:
                invoiceWithCalculatedCosts.setCost(499.99);
                break;
        }
        invoiceRepository.save(invoiceWithCalculatedCosts);
    }

    public String setInvoiceProvided(Long id, Kind kind) {
        Invoice invoiceProvided = Optional.of(invoiceRepository.getOne(id)).orElse(null);
        switch(kind)   {
            case MEDICINE:
                invoiceProvided.setProvided("MEDICINE");
            case TREATMENT:
                invoiceProvided.setProvided("TREATMENT");
                break;
        }
        invoiceRepository.save(invoiceProvided);
        String provided = invoiceProvided.getProvided();
        return provided;
    }

    public Long nextInvoiceNumber() {
        Long invoiceNumber = Long.valueOf(0);
        List<Invoice> invoices = findAll();
//        Invoice  lastInvoice = new Invoice();
//      for (invoice: invoices) {
//            if (invoiceNumber < lastInvoice.getId())
//                invoiceNumber = lastInvoice.getId();
//       }
//        return  invoiceNumber+1;

        Invoice lastInvoice = invoices.stream()
                .max(Comparator.comparing(Invoice::getId))
                .get();
        return lastInvoice.getId()+1;
    }


    public Kind getKind(PatientDTO patientDTO) {
        if (patientDTO.getMedicine().isBlank())
            return Kind.TREATMENT;
        return Kind.MEDICINE;
    }

}
