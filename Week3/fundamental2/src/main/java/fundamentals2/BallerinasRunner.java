package fundamentals2;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BallerinasRunner {

    @Bean
    ApplicationRunner ballerinaRunner(BallerinaLoader ballerinaLoader){
        return args -> {
            System.out.println("Ballerinas: ");
            System.out.println(ballerinaLoader.getBallerinas());
        };
    }

}
