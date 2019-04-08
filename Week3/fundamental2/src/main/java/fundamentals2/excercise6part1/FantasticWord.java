package fundamentals2.excercise6part1;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FantasticWord {
    @Getter
    @Value("${word.meaning}")
    private String Word;
}
