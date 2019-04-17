package com.example.mytodolist_week9.communication;

import com.example.mytodolist_week9.persistance.ToDo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@RestController
public class ToDosClient {

  private final RestTemplate restTemplate;

@Value("${todosclient.server.url}")
  private String url;

  public String send(ToDo toDo) {
    return restTemplate.postForObject(url,toDo, String.class);
  }
}