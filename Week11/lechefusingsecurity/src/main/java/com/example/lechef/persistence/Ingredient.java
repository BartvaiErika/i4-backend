package com.example.lechef.persistence;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient {

  @Id
  @GeneratedValue
  private Long id;

  private String name;
  private double quantity;
  private Boolean available;

}

