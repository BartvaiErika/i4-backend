package endpoints;

import domain.Patient;
import logic.Nurse;
import endpoints.PatientsEndPoint;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.client.RestTemplate;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class PatientsEndPointTest {

    @Autowired
    TestRestTemplate testRestTemplate;

    @Autowired
    PatientsEndPoint patientsEndPoint;

    @MockBean
    RestTemplate restTemplate;

    @MockBean
    Nurse nurse;

    private Patient patient = Patient.builder()
            .name("Ali")
            .diagnose("astma")
            .build();

    @Test
    void respond() {

        String url = "/patients";
        nurse.medicatePatient(patient);

        Patient actualPatient = testRestTemplate.postForObject(url, patient, Patient.class);
        assertThat(actualPatient).isNotNull();
        assertThat(actualPatient.getTreatment()).isEqualTo("Go into bed!");
    }
}