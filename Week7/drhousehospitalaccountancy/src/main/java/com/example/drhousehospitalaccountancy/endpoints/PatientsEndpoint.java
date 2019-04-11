package com.example.drhousehospitalaccountancy.endpoints;

import com.example.drhousehospitalaccountancy.dto.PatientDTO;
import com.example.drhousehospitalaccountancy.domain.Invoice;
import com.example.drhousehospitalaccountancy.domain.Patient;
import com.example.drhousehospitalaccountancy.logic.InvoiceManager;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.drhousehospitalaccountancy.repository.PatientRepository;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/patients")
public class PatientsEndpoint {

    private final PatientRepository patientRepository;
    private final InvoiceManager invoiceManager;
    private PatientDTO patientDTO;

    @PostMapping
    Patient postPatient(@RequestBody UUID uuid) {
        Patient patient = patientRepository.findByUuid(uuid);
        if (!patient.equals(null)) {
            patientRepository.save(patient);
        }
        return patient;
    }

    @PostMapping("/{id}/invoice")
    public Invoice createInvoice(Patient patient) {
        String id = patient.getUuid();
        return invoiceManager.createNewInvoice(id);
    }

    @PutMapping
    Patient updatePatient(@RequestBody UUID uuid) {
        Patient patient = patientRepository.findByUuid(uuid);
        PatientDTO patientDTO = new PatientDTO();
        if (!patientDTO.equals(null)) {
            patientDTO.setName(patient.getName());
            patientDTO.setId(patient.getId().toString());
        }
        return patient;
    }
}
