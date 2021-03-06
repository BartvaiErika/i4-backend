package com.example.drhousehospitalaccountancy.repository;

import com.example.drhousehospitalaccountancy.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PatientRepository extends JpaRepository<Patient, UUID> {
    Patient findByUuid(UUID uuid);

}

