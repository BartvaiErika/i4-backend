package com.example.piratesofcodebean.communication;

import com.example.piratesofcodebean.domain.Trident;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class JackSparrowEndpoint {

  private Trident trident;

  @ModelAttribute("trident")
  Trident trident (){
    return trident;
  }

  @GetMapping
  String get() {
    return "home";
  }
}

