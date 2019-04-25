package com.example.piratesofcodebean.communication;

import com.example.piratesofcodebean.logic.Trident;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/diary")
@RequiredArgsConstructor
public class CarinaEndpoint {

  private final Trident trident;

  @ModelAttribute("trident")
  Trident trident() {
    trident.setStatus(false);
    return trident;
  }

  @GetMapping
  String get() {
    return "diary";
  }

  @PostMapping
  String post() {
    trident.setStatus(true);
    return "redirect:/";
  }
}