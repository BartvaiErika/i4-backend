package com.example.drhousehospitalaccountancy.dto;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class PatientDTO {

    private String id;

    private String name;

    private String symptoms;

    private String diagnosis;

    private String treatment;

    private String medicine;

}
