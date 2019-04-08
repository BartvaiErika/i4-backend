package fundamentals2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("dancing-school")
public class BallerinaLoader {

    @Getter
    @Setter
    private List<Ballerina> ballerinas;
}