package com.example.drhouseadministration.view.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Invoice {

    private Long id;

    private Patient patient;

    private Kind kind;

    private String symptoms;

    private String diagnosis;

    private String provided; //treatment or medicine

    private double cost;

    private boolean paid;

    private LocalDateTime timestamp;

}