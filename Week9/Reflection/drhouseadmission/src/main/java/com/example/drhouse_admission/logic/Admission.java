package com.example.drhouse_admission.logic;

import com.example.drhouse_admission.domain.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class Admission {

  public void admit(Patient patient) {
    patient.setId(UUID.randomUUID().toString());
  }
}