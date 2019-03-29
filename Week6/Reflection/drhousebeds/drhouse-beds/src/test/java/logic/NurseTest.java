package logic;

import domain.Patient;
import logic.Nurse;
import persistence.PatientRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@SpringBootTest(webEnvironment = NONE)
class NurseTest {

    @Autowired
    Nurse nurse;

    @Autowired
    PatientRepository repository;

    @MockBean
    RestTemplate restTemplate;


    Patient patient = Patient.builder()
            .name("David")
            .diagnose("asthma")
            .build();

    @BeforeEach
    void before() {
        repository.deleteAll();
    }

    @Test
    void treat() {
        Patient actualPatient = nurse.medicatePatient(patient) ;
        assertThat(actualPatient).isNotNull();
        assertThat(actualPatient.getTreatment()).isEqualTo("aspirin");
    }
}