package endpoints;

import domain.Patient;
import logic.Apothecary;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
@RequestMapping("/patients")
public class PatientEndPoint {
    private final RestTemplate restTemplate;
    private final String url = "http:localhost:9004";
    private Apothecary apothecary;
    private AccountancyClient accountancy;

    @PostMapping
    public Patient forward(@RequestBody Patient patient) {
        Patient patientWithMedicine = apothecary.provideMedicine(patient);
        accountancy.createInvoice(patientWithMedicine);
        return patientWithMedicine;
    }
}
