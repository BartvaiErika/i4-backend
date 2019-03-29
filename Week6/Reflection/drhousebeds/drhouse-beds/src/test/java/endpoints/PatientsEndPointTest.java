package endpoints;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class PatientsEndPointTest {

    @BeforeEach
    void setUp() {
    }


    @Autowired
    TestRestTemplate testRestTemplate;

    @Autowired
    PatientsEndpoint patientsEndpoint;

    @MockBean
    RestTemplate restTemplate;

    @MockBean
    Nurse nurse;

    @SpyBean
    ForwardClass forwardClass;

    private Patient patient = Patient.builder()
            .name("Ali")
            .diagnosis("astma")
            .build();

    @Test
    void respond() {

    }
}