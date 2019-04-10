package com.example.drhousehospitalaccountancy.logic;

import com.example.drhousehospitalaccountancy.DTO.PatientDTO;
import com.example.drhousehospitalaccountancy.domain.Invoice;
import com.example.drhousehospitalaccountancy.domain.Patient;
import com.example.drhousehospitalaccountancy.repository.InvoiceRepository;
import com.example.drhousehospitalaccountancy.repository.PatientRepository;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.drhousehospitalaccountancy.domain.Kind;
import java.time.LocalDateTime;
import java.util.UUID;

public class InvoiceManager {

    private InvoiceRepository invoiceRepository;
    private PatientRepository patientRepository;
    private PatientDTO patientDTO;
    private Accountant accountant;


    public PatientDTO getPatientDTO (String uuid) {
        patientDTO = getPatientDTO(uuid);
        return patientDTO;
    }

    public Invoice createNewInvoice(@RequestBody String uuid) {
        PatientDTO patientDTO = getPatientDTO(uuid);
        Patient patient = patientRepository.findPatientToId(UUID.fromString(uuid));
        Invoice newInvoice = new Invoice();
        newInvoice.setId(accountant.nextInvoiceNumber());
        newInvoice.setTimestamp(LocalDateTime.now());
        newInvoice.setCost(0.00);
        newInvoice.setPatient(patient);
        newInvoice.setPaid(false);
        Kind kind = accountant.getKind(patientDTO);
        Long newInvoiceId = newInvoice.getId();
        newInvoice.setProvided(accountant.setInvoiceProvided(newInvoiceId, kind));
        String symptoms = patientDTO.getSymptoms();
        newInvoice.setSymptoms(symptoms);
        newInvoice.setDiagnosis(patientDTO.getDiagnosis());
        invoiceRepository.save(newInvoice);
        return newInvoice;
    }

}
