package com.example.drhouseadministration.communication;

import com.example.drhouseadministration.view.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientClient {

  private final RestTemplate restTemplate;

  @Value("${admissionclient.server.url}")
  private String url;

  @PostMapping
  public Patient post(Patient patient) {
    return restTemplate.postForObject(url, patient, Patient.class);
  }

}
