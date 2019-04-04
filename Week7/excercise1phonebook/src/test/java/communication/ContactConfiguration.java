package communication;

import domain.Contact;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
@ConfigurationProperties("contacts")
public class ContactConfiguration {

    @Getter
    @Setter
    Contact contact;

    @Setter
    List<Contact> contacts;

    @Bean
    Contact contact() {
        return contact;
    }

    @Bean
    List<Contact> contacts() {
        return contacts;
    }

}
