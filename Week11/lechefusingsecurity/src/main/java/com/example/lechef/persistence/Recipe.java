package com.example.lechef.persistence;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {

  @Id
  @GeneratedValue
  private Long id;

  private String name;
  private String type;
  private String label;
  private String origin;

  private List<Ingredient> ingredients;

}
