package communication;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class Client {
    RestTemplate restTemplate;
    private String url = "http://localhost:9000";

    public String encrypt(String message) {
        return restTemplate.postForObject(url, message, String.class);
    }

}
