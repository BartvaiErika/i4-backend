package communication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("/user")
public class CarinaEndpoint {

  @GetMapping
  @RolesAllowed("USER")
  String message() {
    return "I destroy the Trident and release the Flying Dutchman from its curse and redirect to ...!";
  }

}