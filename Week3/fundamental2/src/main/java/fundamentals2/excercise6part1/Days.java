package fundamentals2.excercise6part1;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Days {
    @Getter
 //   @Value("${369}")
    @Value("369")
    private int days;
}
