package logic;

import domain.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class DrHouseHospital {

    RestTemplate restTemplate;
    @Bean
    public Patient createDiagnosis (Patient patient) {
       patient.setDiagnose("lupus");
       return patient;
    }
}
