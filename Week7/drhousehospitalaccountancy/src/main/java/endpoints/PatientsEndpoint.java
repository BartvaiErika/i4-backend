package endpoints;

import domain.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.PatientRepository;

import java.util.Random;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/patients")
public class PatientsEndpoint {

    private final PatientRepository patientRepository;

//    POST a PatientDTO with id, name, symptoms, diagnosis
//    and treatment or medicine to /patients ->
//    Stores the Patient if it doesn’t exist,

    @PostMapping
    Patient postPatient(UUID uuid) {
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
    Patient uodatePatient(UUID uuid) {
        Random random = new Random();
        Patient patientDTO = patientRepository.findPatientToId(uuid);
        if (!patientDTO.equals(null)) {
            patientDTO.setName("Peterson");
            patientDTO.setId(random.nextLong());
        }
        return patientDTO;
    }
}
