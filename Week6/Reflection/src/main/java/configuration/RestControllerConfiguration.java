package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class RestControllerConfiguration {
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
