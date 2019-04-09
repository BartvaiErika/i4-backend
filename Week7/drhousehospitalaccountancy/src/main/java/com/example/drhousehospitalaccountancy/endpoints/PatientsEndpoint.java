package com.example.drhousehospitalaccountancy.endpoints;

import com.example.drhousehospitalaccountancy.domain.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.drhousehospitalaccountancy.repository.PatientRepository;

import java.util.Random;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/patients")
public class PatientsEndpoint {

    private final PatientRepository patientRepository;

    @PostMapping
    Patient postPatient(@RequestBody UUID uuid) {
        Random random = new Random();
        Patient patientDTO = patientRepository.findPatientToId(uuid);
        if (patientDTO.equals(null)) {
            patientDTO.setUuid(uuid.toString());
            patientDTO.setName("Peterson");
            patientDTO.setId(random.nextLong());
            patientRepository.save(patientDTO);
        }
        return patientDTO;
    }

//    updates it if it already exists (based on the uuid)
    @PutMapping
    Patient uodatePatient(@RequestBody UUID uuid) {
        Random random = new Random();
        Patient patientDTO = patientRepository.findPatientToId(uuid);
        if (!patientDTO.equals(null)) {
            patientDTO.setName("Peterson");
            patientDTO.setId(random.nextLong());
        }
        return patientDTO;
    }
}
