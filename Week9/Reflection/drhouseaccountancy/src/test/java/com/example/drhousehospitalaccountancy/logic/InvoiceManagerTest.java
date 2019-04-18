package com.example.drhousehospitalaccountancy.logic;

import com.example.drhousehospitalaccountancy.domain.Invoice;
import com.example.drhousehospitalaccountancy.domain.Kind;
import com.example.drhousehospitalaccountancy.domain.Patient;
import com.example.drhousehospitalaccountancy.dto.PatientDTO;
import com.example.drhousehospitalaccountancy.repository.InvoiceRepository;
import com.example.drhousehospitalaccountancy.repository.PatientRepository;
import lombok.Setter;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@SpringBootTest(webEnvironment = NONE)
class InvoiceManagerTest {

  @Autowired
  private InvoiceRepository invoiceRepository;

  @Autowired
  InvoiceManager invoiceManager;

  @Autowired
  PatientRepository patientRepository;

  @Autowired
  Accountant accountant;

  @Setter
  PatientDTO patientDTO;

  @Before
  public void setUp() throws Exception {
    patientRepository.deleteAll();
    invoiceRepository.deleteAll();
  }

  @Test
  void createNewInvoice(String uuid) {
    Invoice testInvoice = invoiceManager.createNewInvoice(uuid);
    Assertions.assertThat(testInvoice.equals(null));
    Assert.assertNotNull(testInvoice);

  }
}