package logic;

import domain.Invoice;
import domain.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.InvoiceRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class Accountant {

    private final InvoiceRepository invoiceRepository;

    List<Invoice> findAll() {
        return invoiceRepository.findAll();
    }

    Invoice bookInvoicePaid(long id) {
        Invoice paidInvoice = invoiceRepository.getOne(id);
        paidInvoice.setPaid(true);
        return paidInvoice;
    }

    Invoice createNewInvoice(Patient patient) {
        Random random = new Random();
        LocalDateTime localDateTime = LocalDateTime.now();
        Invoice newInvoice = new Invoice();
        newInvoice.setId(random.nextLong());
        newInvoice.setCost(0.0);
        newInvoice.setPatient(patient);
        newInvoice.setPaid(false);
        newInvoice.setTimestamp(localDateTime);
        newInvoice.setKind();
        newInvoice.setProvided("MEDICINE");
        //newInvoice.setSymptoms();
        //newInvoice.setDiagnosis();
        invoiceRepository.save(newInvoice);
        return newInvoice;
    }

    Invoice calculateCosts(long id) {
        Invoice invoiceWithCalculatedCosts = invoiceRepository.getOne(id);
        if (invoiceWithCalculatedCosts.getProvided("MEDICINE"))
            invoiceWithCalculatedCosts.setCost(50.00);
        else
            invoiceWithCalculatedCosts.setCost(500.00);
        invoiceRepository.save(invoiceWithCalculatedCosts);
        return invoiceWithCalculatedCosts;
    }

//    to make sure that the right Invoice is created when a Patient arrives
//    or both treatment and medicine cases.
//    Make sure as well that an Invoice is set to paid when requested.
}
