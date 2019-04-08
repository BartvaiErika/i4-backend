package exercise9cinemamessages.view;

import exercise9cinemamessages.controller.TextMessageSender;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CinemaMessageSender {

    @Bean
    ApplicationRunner send(TextMessageSender sender){
        return args -> {
            sender.display();
        };
    }
}
