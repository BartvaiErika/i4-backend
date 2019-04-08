import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BallerinaTest {
    @Autowired
    Ballerina ballerina;
    @ParameterizedTest
    @CsvSource({
            "performanceQuality1, 1",
            "performanceQuality2, 3",
            "performanceQuality2, 5"
    })

    void getPerformanceQuality(String name, Integer perfomranceQuantity ) {
        Assertions.assertEquals(ballerina.getPerformanceQuality(), perfomranceQuantity);
    }
}