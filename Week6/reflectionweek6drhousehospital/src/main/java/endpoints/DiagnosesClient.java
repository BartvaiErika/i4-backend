package endpoints;

import domain.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class DiagnosesClient {
    private final RestTemplate restTemplate;
    private String diagnoseUrl = "http://localhost:9006/patients";

    public Patient respondDiagnosis(Patient patient) {
        Patient diagnosedPatient =  restTemplate.postForObject(diagnoseUrl,patient, Patient.class);
        return diagnosedPatient;
    }
}
