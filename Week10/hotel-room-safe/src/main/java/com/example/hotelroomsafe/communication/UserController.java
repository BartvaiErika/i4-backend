package com.example.hotelroomsafe.communication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {

  @GetMapping
  String page() {
    return "hotelsafe";
  }

  @ModelAttribute("principal")
  Principal principal(Principal principal) {
    return principal;
  }

}