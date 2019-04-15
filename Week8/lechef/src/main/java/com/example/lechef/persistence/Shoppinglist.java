package com.example.lechef.persistence;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

public class Shoppinglist {

  private List<Ingrediment> ingrediments;

  private Integer quantity;

}

