package com.example.piratesofcodebean.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
public class Trident {

  @Getter
  @Setter
  private Boolean destroyed;
}
