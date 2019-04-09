package com.example.phone_book_new.persistence.domain;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Contact {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique=true)
    private String name;

    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Address address;
}
