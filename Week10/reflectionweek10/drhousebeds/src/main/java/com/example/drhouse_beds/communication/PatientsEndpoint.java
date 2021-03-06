package com.example.drhouse_beds.communication;

import com.example.drhouse_beds.domain.Patient;
import com.example.drhouse_beds.logic.DrHouse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientsEndpoint {

  private final DrHouse drHouse;
  private final RestTemplate restTemplate;
  private final List<String> severcases;

  @Value("${bed.server.url}")
  private String bedUrl;

  @Value("${pharmacy.server.url}")
  private String pharmacyUrl;

  @PostMapping
  Patient post(@RequestBody Patient patient) {
    Patient diagnosedPatient = drHouse.diagnose(patient);
    forwardToRelevantDepartment(diagnosedPatient);
    return diagnosedPatient;
  }


  public String forwardToRelevantDepartment(Patient patient) {
    if (severcases.contains(patient.getDiagnoses())) {
      restTemplate.postForObject(bedUrl, patient, Patient.class);
      return "Beds";
    } else {
      restTemplate.postForObject(pharmacyUrl, patient, Patient.class);
    }
    return "Pharmacy";
  }
}