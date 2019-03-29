package endpoints;

import domain.Patient;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountancyClient {

    private final Resttemplate resttemplate;
    private String url;
    @Value("${accountancy.server.url}")

    public Double calculateCosts() {
        return 0.0;
    }

    public void createInvoice(Patient patient) {
        resttemplate.postForObject(url, patient, Patient.class);
    }
}
