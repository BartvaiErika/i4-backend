package com.example.morseencoder.view.communication;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@RestController
public class EncoderClient {

  private final RestTemplate restTemplate;

  @Value("${client.server.url}")
  private String url;

  public String send(String plainText) {
    return restTemplate.postForObject(url,plainText, String.class);
  }
}
