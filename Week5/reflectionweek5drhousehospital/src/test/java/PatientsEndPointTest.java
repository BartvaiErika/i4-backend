import domain.Patient;
import logic.DrHouseAdmission;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestTemplate;

public class PatientsEndPointTest {
    @Autowired
    DrHouseAdmission admission;

    @MockBean
    RestTemplate restTemplate;

    @ParameterizedTest
    @CsvSource({
            "Erika, fractura",
    })

    public void respond(String name, String symptoms) {
        Patient patient = Patient.builder()
                .name(name)
                .symptoms(symptoms)
                .build();
        admission.admit(patient);
        org.assertj.core.api.Assertions.assertThat(patient.getId()).isNotNull();
    }
}
