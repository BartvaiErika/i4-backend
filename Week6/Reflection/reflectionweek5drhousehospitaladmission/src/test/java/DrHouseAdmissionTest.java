import domain.Patient;
import logic.DrHouseAdmission;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestTemplate;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@SpringBootTest(webEnvironment = NONE)
class DrHouseAdmissionTest {
    @Autowired
    DrHouseAdmission admission;

    @MockBean
    RestTemplate restTemplate;

    @ParameterizedTest
    @CsvSource({"Erika, fractura",})
    void admit(String name, String symptoms) {
        Patient patient = Patient.builder()
                .name(name)
                .symptoms(symptoms)
                .build();
        admission.admit(patient);
        Assertions.assertNotEquals(null, patient.getId());
        Assert.assertNotEquals(null, patient.getId());
    }
}
