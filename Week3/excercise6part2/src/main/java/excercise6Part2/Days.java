package excercise6Part2;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Days {
    @Getter
    @Value("${365}")
    private int days;
}
