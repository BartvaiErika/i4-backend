package endpoints;

import domain.Patient;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class AccountancyClient {

    private final RestTemplate restTemplate;
    private String url;

   // @Value("${accountancy.server.url}")
    public String createInvoice(Patient patient) {
        restTemplate.postForObject(url, patient, Patient.class);
        return "Invoice voila.";
    }
    public Double calculateCosts() {
        return 0.0;
    }
}