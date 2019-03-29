package logic;

import domain.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class DrHouseHospital {

    private RestTemplate restTemplate;

    private Map<String,String> diagnoses;

    @Bean
    public Patient createDiagnosis(Patient patient) {
        patient.setDiagnose(getDiagnoses(patient));
        return patient;
    }

    public String getDiagnoses(Patient patient) {
        String symptoms = patient.getSymptoms();
        return diagnoses.getOrDefault(symptoms,"lupus");
    }
}
