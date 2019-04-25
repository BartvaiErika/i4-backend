package com.example.piratesofcodbean2.communication;

import com.example.piratesofcodbean2.logic.Trident;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class JackSparrowEndpoint {

  private final Trident trident;

  @ModelAttribute("trident")
  Trident trident() {
    trident.setStatus(false);
    return trident;
  }

  @GetMapping
  String get() {
    return "home";
  }
}