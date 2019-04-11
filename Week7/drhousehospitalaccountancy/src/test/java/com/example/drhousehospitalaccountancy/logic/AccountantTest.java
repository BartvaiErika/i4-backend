package com.example.drhousehospitalaccountancy.logic;

import com.example.drhousehospitalaccountancy.domain.Patient;
import com.example.drhousehospitalaccountancy.dto.PatientDTO;
import com.example.drhousehospitalaccountancy.domain.Invoice;
import com.example.drhousehospitalaccountancy.repository.PatientRepository;
import lombok.Setter;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.drhousehospitalaccountancy.repository.InvoiceRepository;

import java.util.List;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

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
    public void findAll() {
    }

    @Test
    public void bookInvoicePaid() {
    }
}