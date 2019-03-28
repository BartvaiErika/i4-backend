package endpoints;

import domain.Patient;
import logic.Apothecary;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientEndPoint {
    private final RestTemplate restTemplate;
    private final String url = "http:localhost:9004";
    private Apothecary apothecary;

    @PostMapping
    public Patient respond(@RequestBody Patient patient) {
        return apothecary.admit(patient);
    }
}
