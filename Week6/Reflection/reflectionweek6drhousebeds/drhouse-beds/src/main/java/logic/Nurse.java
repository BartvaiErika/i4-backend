package logic;

//Behaviour:
//POST a Patient with id, name, symptoms and diagnosis to /patients ->
//Provides the Patient with a treatment
//Later on: forwards the Patient to Accountancy

import domain.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class Nurse {

    RestTemplate restTemplate;

    @Bean
    public Patient medicatePatient (Patient patient) {
        patient.setTreatment("Go into bed!");
        return patient;
    }

}
