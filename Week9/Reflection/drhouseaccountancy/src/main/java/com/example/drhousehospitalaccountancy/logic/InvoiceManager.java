package com.example.drhousehospitalaccountancy.logic;

import com.example.drhousehospitalaccountancy.dto.PatientDTO;
import com.example.drhousehospitalaccountancy.domain.Invoice;
import com.example.drhousehospitalaccountancy.domain.Patient;
import com.example.drhousehospitalaccountancy.repository.InvoiceRepository;
import com.example.drhousehospitalaccountancy.repository.PatientRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.drhousehospitalaccountancy.domain.Kind;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
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
        Patient patient = patientRepository.findByUuid(UUID.fromString(uuid));
        Kind kind = accountant.getKind(patientDTO);
        Long newInvoiceId = accountant.nextInvoiceNumber();

        Invoice newInvoice = Invoice.builder()
                             .id(newInvoiceId)
                             .patient(patient)
                             .kind(kind)
                             .symptoms(patientDTO.getSymptoms())
                             .diagnosis(patientDTO.getDiagnosis())
                             .provided(accountant.setInvoiceProvided(newInvoiceId, kind))
                             .cost(0.00)
                             .paid(false)
                             .timestamp(LocalDateTime.now()).build();

        invoiceRepository.save(newInvoice);
        return newInvoice;
    }
}
