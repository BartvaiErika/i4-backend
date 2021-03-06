package com.example.pharmacy.persistence;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Patient {

  private String id;
  private String name;
  private String symptoms;
  private String diagnosis;
  private String medicine;

}