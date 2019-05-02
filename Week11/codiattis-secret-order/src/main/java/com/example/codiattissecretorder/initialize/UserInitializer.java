package com.example.codiattissecretorder.initialize;

import com.example.codiattissecretorder.persistence.domain.User;
import com.example.codiattissecretorder.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;

import java.util.Set;

@Controller
public class UserInitializer {

  @Autowired
  PasswordEncoder passwordEncoder;

//  @Bean
//  ApplicationRunner initializeUser(PasswordEncoder encoder,
//                                   UserRepository repository) {
//    return args -> {
//      User user = createUser(encoder);
//      if (repository.existsByUsername(user.getUsername())) {
//        return;
//      }
//      repository.save(user);
//    };
//  }

  private User createUser(PasswordEncoder encoder) {
    return User.builder()
               .name("Mr. User")
               .username("user")
               .password(encoder.encode("secret"))
               .isAdmin(false)
               .authorities(Set.of("USER"))
               .build();
  }
}
