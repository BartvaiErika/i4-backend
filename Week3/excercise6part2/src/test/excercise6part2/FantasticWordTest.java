import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FantasticWordTest {
    @Autowired
    FantasticWord word;

    @Test
    void getName() {
        String actual = word.getWord();
        Assertions.assertEquals("fantastic",actual);
    }
}