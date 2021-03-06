package com.example.thievesden.communication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("/")
public class UserEndpoint {

  @GetMapping
  @RolesAllowed("USER")
  String message() {
    return "Welcome into the tresaury of Ali Baba!";
  }

}
