import domain.Patient;
import logic.DrHouseHospital;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

//Test the DrHouse with WebEnvironment.NONE
@SpringBootTest(webEnvironment = NONE)

public class DrHouseHospitalTest {

    @Autowired
    DrHouseHospital hospital;

    @MockBean
    TestRestTemplate testRestTemplate;

//    @ParameterizedTest
//    @CsvSource({"Erika, fractura, lupus",})

    @Test
    public void createDiagnosis() {
        Patient patient = Patient.builder()
                .name("Erika")
                .symptoms("fractura")
                .diagnose("lupus")
                .build();
        Assertions.assertEquals("lupus",patient.getDiagnose());
    }
}