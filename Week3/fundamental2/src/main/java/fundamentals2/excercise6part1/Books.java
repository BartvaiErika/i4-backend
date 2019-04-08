package fundamentals2.excercise6part1;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Setter
@Getter
@ConfigurationProperties("bookstore")
public class Books {

    private List<Book> book;
}

