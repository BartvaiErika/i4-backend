package com.example.piratesofcodebean.communication;

import com.example.piratesofcodebean.domain.Trident;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;

@Controller
@RequestMapping("/diary")
@RequiredArgsConstructor
public class CarinaEndpoint {

  private Trident trident;

  @ModelAttribute("trident")
  Trident trident (){
    return trident;
  }

  @GetMapping
  String get() {
    return "diary";
  }

  @PostMapping
  String post() {
    trident.setDestroyed(true);
    return "redirect:/";
  }
}