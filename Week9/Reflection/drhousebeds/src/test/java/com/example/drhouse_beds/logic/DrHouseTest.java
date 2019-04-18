//package com.example.drhouse_beds.logic;
//
//import com.example.drhouse_beds.domain.Patient;
//import org.assertj.core.api.Assertions;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.web.client.RestTemplate;
//
//import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.*;
//
//@SpringBootTest(webEnvironment = NONE)
//class DrHouseTest {
//
//  @Autowired
//  DrHouse drHouse;
//
//  @MockBean
//  RestTemplate restTemplate;
//
//  @ParameterizedTest
//  @CsvSource({
//      "accident,brucken leg",
//      "headache,migren",
//      "toothache,lupus",
//      ",lupus"
//  })
//  void diagnose(String symptoms, String diagnosis) {
//    Patient patient = Patient.builder()
//                             .name("David")
//                             .symptoms(symptoms)
//                             .build();
//    Patient diagnosed = drHouse.diagnose(patient);
//
//    Assertions.assertThat(diagnosed.getDiagnoses()).isEqualTo(diagnosis);
//  }
//}

