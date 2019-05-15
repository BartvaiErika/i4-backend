package com.example.morse.controller;

import com.example.morse.persistence.Dictionary;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MorseEncoder {
  private final Dictionary dictionary;

  public String translate(String letter) {
    String encodedLetter = dictionary.getDictionary().get(letter.toUpperCase());
    return encodedLetter;
  }
}
