package endpoints;

import domain.Patient;
import endpoints.PatientEndPoint;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockBeans;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.client.RestTemplate;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class PatientEndPointTest {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    PatientEndPoint patientEndPoint;

    @MockBean
    TestRestTemplate testRestTemplate;

    private Patient patient = Patient.builder()
            .name("Maxima")
            .diagnose("astma")
            .build();

    @Test
    public void forwardtest() {
        String url = "/patients";
        Patient actualPatient =
                testRestTemplate.postForObject(url, patient, Patient.class);
        assertThat(actualPatient).isNotNull();
        assertThat(actualPatient.getMedicine().equals("aspirin"));

    }
}