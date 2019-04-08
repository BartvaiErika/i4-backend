import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SaunaTest {
    @Autowired
    Sauna sauna;
    void getSaunaTest() {
        int actual = sauna.getSauna();
        Assertions.assertEquals(actual,"25");
    }
}