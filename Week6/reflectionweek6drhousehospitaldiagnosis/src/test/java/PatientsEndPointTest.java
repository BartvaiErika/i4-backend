import domain.Patient;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.client.RestTemplate;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)

public class PatientsEndPointTest {
//Test the PatientsEndpoint with a TestRestTemplate
// and WebEnvironment.RANDOM_PORT

    @Autowired
    TestRestTemplate testRestTemplate;
    String url = "/patients";

    @MockBean
    RestTemplate restTemplate;

//    @ParameterizedTest
//    @ValueSource({"Erika, fraktura"})

    @Test
    public void sendDiagnosis() {
        Patient patient = Patient.builder()
                .name("Erika")
                .symptoms("fractura")
                .diagnose("lupus")
                .build();
        Patient actualPatient =
                testRestTemplate.postForObject(url, patient, Patient.class);
        Assertions.assertEquals("Erika", actualPatient.getName());
        Assertions.assertEquals("fractura", actualPatient.getName());
        Assertions.assertEquals("lupus", actualPatient.getDiagnose());
    }

}