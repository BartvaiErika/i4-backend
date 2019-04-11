package com.example.drhousehospitalaccountancy.logic;

import com.example.drhousehospitalaccountancy.dto.PatientDTO;
import com.example.drhousehospitalaccountancy.repository.InvoiceRepository;
import lombok.Setter;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@SpringBootTest(webEnvironment = NONE)
class InvoiceManagerTest {

  @Autowired
  private InvoiceRepository invoiceRepository;

  @Autowired
  InvoiceManager invoiceManager;

  @Autowired
  Accountant accountant;

  @Setter
  PatientDTO patientDTO;

  @Before
  public void setUp() throws Exception {
    invoiceRepository.deleteAll();
  }

  @Test
  void createNewInvoice() {

  }
}