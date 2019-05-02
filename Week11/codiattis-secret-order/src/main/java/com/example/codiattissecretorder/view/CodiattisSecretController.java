package com.example.codiattissecretorder.view;

import com.example.codiattissecretorder.initialize.UserInitializer;
import com.example.codiattissecretorder.persistence.domain.User;
import com.example.codiattissecretorder.persistence.repository.UserRepository;
import com.example.codiattissecretorder.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/")
public class CodiattisSecretController {

  private UserRepository repository;
  private UserInitializer userInitializer;

  @Autowired
  PasswordEncoder passwordEncoder;

  @GetMapping
  String page() {
    return "home";
  }

  @ModelAttribute("principal")
  UserPrincipal principal(@AuthenticationPrincipal UserPrincipal principal) {
    return principal;
  }

  @ModelAttribute("user")
  List<User> findAllUsers() {
    return repository.findAll();
  }

  @PostMapping
  @RolesAllowed("ROLE_ADMIN")
  String post(@Valid User user, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) return page();

    repository.save(userInitializer.createUser(passwordEncoder));
    return "redirect:/";
  }

}