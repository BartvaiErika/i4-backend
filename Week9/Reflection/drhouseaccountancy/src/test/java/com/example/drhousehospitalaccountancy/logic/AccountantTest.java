package com.example.drhousehospitalaccountancy.logic;

import com.example.drhousehospitalaccountancy.domain.Kind;
import com.example.drhousehospitalaccountancy.domain.Patient;
import com.example.drhousehospitalaccountancy.dto.PatientDTO;
import com.example.drhousehospitalaccountancy.domain.Invoice;
import com.example.drhousehospitalaccountancy.repository.PatientRepository;
import lombok.Setter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.drhousehospitalaccountancy.repository.InvoiceRepository;

import java.util.List;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;
import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest(webEnvironment = NONE)
public class AccountantTest {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    Accountant accountant;

    @Setter
    PatientDTO patientDTO;

    @Before
    public void setUp() throws Exception {
        invoiceRepository.deleteAll();
        patientRepository.deleteAll();
    }

    @Test
    public void testFindAll() {
        List <Invoice> actualInvoices = accountant.findAll();
        Assert.assertNotNull(actualInvoices);
    }

    @Test
    public void testBookInvoicePaid(Long id) {
        accountant.bookInvoicePaid(id);
        Invoice actual = invoiceRepository.getOne(id);
        Assert.assertTrue(actual.getPaid());
    }

    @Test
    public void testCalculatingCosts(Long id) {
        Kind kind = Kind.valueOf("MEDICINE");
        accountant.calculateCosts(id, kind);
        Double expected = 49.99;
        Double actual = invoiceRepository.getOne(id).getCost();
        Assert.assertTrue(actual.equals(expected));
        Assert.assertNotNull(actual);
        kind = Kind.valueOf("TREATMENT");
        accountant.calculateCosts(id, kind);
        expected = 499.99;
        actual = invoiceRepository.getOne(id).getCost();
        Assert.assertTrue(actual.equals(expected));
        Assert.assertNotNull(actual);
    }

    @Test
    public void testSettingInvoiceProvided(Long id) {
        Kind kind = Kind.valueOf("MEDICINE");
        accountant.setInvoiceProvided(id, kind);
        String expectedProvided = "MEDICINE";
        String actualProvided = invoiceRepository.getOne(id).getProvided();
        Assert.assertTrue(actualProvided.equals(expectedProvided));

        kind = Kind.valueOf("TREATMENT");
        accountant.setInvoiceProvided(id, kind);
        expectedProvided = "TREATMENT";
        actualProvided = invoiceRepository.getOne(id).getProvided();
        Assert.assertTrue(actualProvided.equals(expectedProvided));
    }

    @Test
    public void testNextInvoiceNumber() {
        Long testInvoiceNumber = accountant.nextInvoiceNumber();
        Assert.assertFalse(testInvoiceNumber.equals(Long.valueOf(0))) ;
        Assert.assertFalse(testInvoiceNumber.equals(testInvoiceNumber-1)) ;
        Assert.assertNotNull(testInvoiceNumber);
    }

    @Test
    public void getKind() {
        Kind actualKind = Kind.valueOf(patientDTO.getMedicine());
        Kind expectedKind = Kind.MEDICINE;
        Assert.assertTrue(actualKind.equals(expectedKind));
        Assert.assertNotNull(actualKind);
        actualKind = Kind.valueOf(patientDTO.getTreatment());
        expectedKind = Kind.TREATMENT;
        Assert.assertTrue(actualKind.equals(expectedKind));
        Assert.assertNotNull(actualKind);
        actualKind = accountant.getKind(patientDTO);
        Assert.assertNotNull(actualKind);
    }

}