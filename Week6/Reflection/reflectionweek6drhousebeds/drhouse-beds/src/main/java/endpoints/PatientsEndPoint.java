package endpoints;

import domain.Patient;
import logic.Nurse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
@RequestMapping("/patients")
public class PatientsEndPoint {

    private final RestTemplate restTemplate;
    private final String url = "http:localhost:9003";
    private Nurse nurse;

    @PostMapping("/name/{name}")
    public Patient respond(@RequestBody Patient patient) {
        return nurse.medicatePatient(patient);
    }
}
