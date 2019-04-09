package com.example.drhousehospitalaccountancy.logic;

import com.example.drhousehospitalaccountancy.DTO.PatientDTO;
import com.example.drhousehospitalaccountancy.domain.Invoice;
import com.example.drhousehospitalaccountancy.domain.Kind;
import com.example.drhousehospitalaccountancy.domain.Patient;
import com.example.drhousehospitalaccountancy.repository.InvoiceRepository;
import com.example.drhousehospitalaccountancy.repository.PatientRepository;

import java.time.LocalDateTime;

public class InvoiceManager {

    private final InvoiceRepository invoiceRepository;
    private final PatientRepository patientRepository;
    private final PatientDTO patientDTO;
    private final Accountant accountant;

    public Invoice createNewInvoice(Patient patient) {
        LocalDateTime localDateTime = LocalDateTime.now();
        Invoice newInvoice = new Invoice();
        newInvoice.setId(Long.valueOf(3423424));
        newInvoice.setCost(0.0);
        newInvoice.setPatient(patient);
        newInvoice.setPaid(false);
        newInvoice.setTimestamp(localDateTime);
        //Kind kind = new Kind();
        newInvoice.setKind(Kind.MEDICINE);
        newInvoice.setProvided(Kind.MEDICINE);
        //newInvoice.setSymptoms();
        //newInvoice.setDiagnosis();
        invoiceRepository.save(newInvoice);
        return newInvoice;
    }


}
