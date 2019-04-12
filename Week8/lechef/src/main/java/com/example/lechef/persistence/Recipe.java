package com.example.lechef.persistence;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Recipe {

  @Id
  @GeneratedValue
  private Long id;

  @Column(unique=true)
  private String name;

  @OneToOne
  private String type;

  @OneToMany
  private String label;

  @OneToOne
  private String origin;

  @ManyToMany
  private List<Ingrediment> ingrediments;

}
