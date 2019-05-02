package com.example.codiattissecretorder.initialize;

import com.example.codiattissecretorder.persistence.domain.User;
import com.example.codiattissecretorder.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Set;

@Configuration
public class AdminInitializer {

  @Bean
  ApplicationRunner initializeUser(PasswordEncoder encoder, UserRepository repository) {
    return args -> {
      User admin = User.builder()
                       .name("Chief Coder")
                       .username("user")
                       .password(encoder.encode("secret"))
                       .isAdmin(true)
                       .authorities(Set.of("ADMIN"))
                       .build();

      if (repository.existsByUsername(admin.getUsername())) {
        return;
      }
      repository.save(admin);
    };
  }

//  private User createUser(PasswordEncoder encoder) {
//    return User.builder()
//               .name("Chief Coder")
//               .username("user")
//               .password(encoder.encode("secret"))
//               .authorities(Set.of("ADMIN"))
//               .build();
//  }

}
















