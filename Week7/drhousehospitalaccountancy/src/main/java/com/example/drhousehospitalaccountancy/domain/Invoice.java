package com.example.drhousehospitalaccountancy.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Invoice {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Patient patient;

    @Enumerated(EnumType.STRING)
    private Kind kind;

    @OneToMany(cascade = CascadeType.ALL)
    private List<String> symptoms;

    @OneToMany(cascade = CascadeType.ALL)
    private List<String> diagnosis;

    @OneToOne(cascade = CascadeType.ALL)
    private String provided; //(either the treatment given or the medicine suggested)

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private double cost;

    @OneToOne(cascade = CascadeType.ALL)
    private Boolean paid;

    @OneToOne(cascade = CascadeType.ALL)
    private LocalDateTime timestamp;

}