package com.example.magicballs.view.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@Controller
//@ConfigurationProperties("/list")
@RequestMapping("/list/message")
public class SimpleMessageController {

  @ModelAttribute("message")
  String message() {
    return "Message from the View Controller";
  }

  @GetMapping
  String page() {
    return "messages/simple-message";
  }

}