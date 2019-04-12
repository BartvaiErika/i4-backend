package com.example.lechef.persistence;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Shoppinglist {


  @Id
  @GeneratedValue
  private Long id;

  @Column(unique=true)
  private String name;

  private List<Ingrediment> ingrediments;

}

