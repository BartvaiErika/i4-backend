package logic;

import domain.Patient;
import persistence.PatientRepository;
import logic.Apothecary;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@SpringBootTest(webEnvironment = NONE)
class ApothecaryTest {

    @Autowired
    PatientRepository repository;

    @Mock
    Apothecary apothecary;

    Patient patient = Patient.builder().name("Ali").diagnose("astma").build();

    @BeforeEach
    void setUp() {
        repository.deleteAll();
    }

    @Test
    void provideMedicine() {
        Patient actualPatient = apothecary.provideMedicine(patient);
        Mockito.verify(actualPatient.getMedicine());
       // assertThat(actualPatient.getMedicine()).isEqualTo("aspirin");

    }
}