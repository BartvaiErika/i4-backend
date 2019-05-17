package com.example.morse.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class MorseEncoder {

  private final Map<String, String> dictionary;

  @Value("${translation.not-supported}")
  private String notSupported;

  public String translate(String letter) {
    String encodedLetter = dictionary.get(letter.toUpperCase());
    return dictionary.getOrDefault(encodedLetter, notSupported);
  }
}
