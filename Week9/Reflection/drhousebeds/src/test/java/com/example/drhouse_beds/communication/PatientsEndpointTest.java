//package com.example.drhouse_beds.communication;
//
//import com.example.drhouse_beds.domain.Patient;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.web.client.RestTemplate;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
//
//@SpringBootTest(webEnvironment = RANDOM_PORT)
//class PatientsEndpointTest {
//
//  @Autowired
//  TestRestTemplate testRestTemplate;
//  @Autowired
//  PatientsEndpoint patientsEndpoint;
//  @MockBean
//  RestTemplate restTemplate;
//  String url = "/patients";
//
//  @Test
//  void post() {
//    Patient patient = Patient.builder()
//                             .name("David")
//                             .symptoms("headache")
//                             .build();
//    Patient actual = testRestTemplate.postForObject(url, patient, Patient.class);
//
//    assertThat(actual.getDiagnoses()).isNotEmpty();
//  }
//
//  @ParametrizedTest
//  @CsvSource({
//      "migren,Pharmacy",
//      "food poisoning,Beds",
//      "heart attack,Beds",
//      "asthma,Pharmacy",
//  })
//  void sendToRelevantDepartment(String diagnosis, String department) {
//    Patient patient = Patient.builder()
//                             .name("David")
//                             .diagnoses(diagnosis)
//                             .build();
//
//    String actual = patientsEndpoint.forwardToRelevantDepartment(patient);
//
//    assertThat(actual).isEqualTo(department);
//  }
//}
