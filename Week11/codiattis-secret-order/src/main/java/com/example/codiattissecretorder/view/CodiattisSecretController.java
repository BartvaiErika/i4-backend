package com.example.codiattissecretorder.view;

import com.example.codiattissecretorder.security.UserPrincipal;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CodiattisSecretController {

  @GetMapping
  String page() {
    return "home";
  }

  @ModelAttribute("principal")
  UserPrincipal principal(@AuthenticationPrincipal UserPrincipal principal) {
    return principal;
  }

}