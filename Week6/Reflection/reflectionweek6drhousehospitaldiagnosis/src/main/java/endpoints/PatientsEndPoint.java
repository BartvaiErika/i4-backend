package endpoints;

import domain.Patient;
import logic.DrHouseHospital;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Service
@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor

public class PatientsEndPoint {

    private final RestTemplate restTemplate;
    private final DrHouseHospital hospital;
    private String url = "http://localhost/9006";

    @PostMapping
    public Patient sendDiagnosis(@RequestBody Patient patient) {
        restTemplate.postForObject(url, patient, Patient.class);
        return patient;
    }
}

