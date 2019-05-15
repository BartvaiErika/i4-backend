import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//encoder
@FeignClient("morse")
public interface MenuClient {

  @GetMapping("/morse")
  List<String> findMeals();

}
