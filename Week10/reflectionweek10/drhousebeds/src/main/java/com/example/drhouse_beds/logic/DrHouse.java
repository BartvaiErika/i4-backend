package com.example.drhouse_beds.logic;

import com.example.drhouse_beds.domain.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class DrHouse {

  private final Map<String, String> diagnosesBook;

  public Patient diagnose(Patient patient) {
    if (isDrRecognizeTheIllness(patient)) {
      patient.setDiagnoses(assignDiagnose(patient));
      return patient;
    }
    patient.setDiagnoses("lupus");
    return patient;
  }


  private Boolean isDrRecognizeTheIllness(Patient patient) {
    String symptoms = patient.getSymptoms();
    return diagnosesBook.containsKey(symptoms);
  }

  private String assignDiagnose(Patient patient) {
    String symptoms = patient.getSymptoms();
    return diagnosesBook.get(symptoms);
  }
}
