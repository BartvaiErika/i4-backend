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
    }

    @Test
    public void testBookInvoicePaid() {
    }

    @Test
    public void testCalculatingCosts(Long id, Kind kind) {

    }

    @Test
    public void testSettingInvoiceProvided(Long id, Kind kind) {

    }

    @Test
    public void testNextInvoiceNumber() {

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
    }

}