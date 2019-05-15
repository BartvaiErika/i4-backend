import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class EncoderApplication {

  public static void main(String[] args) {
    SpringApplication.run(EncoderApplication.class, args);
  }
}