package logic;

//Behaviour:
//POST a Patient with id, name, symptoms and diagnosis to /patients ->
//Provides the Patient with a medicine
//Later on: forwards the Patient to Accountancy

import domain.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Service
@RestController
@RequiredArgsConstructor
public class Apothecary {
    RestTemplate restTemplate;

    @Bean
    public Patient provideMedicine(Patient patient) {
        patient.setMedicine("Aspirin");
        return patient;
    }
}
