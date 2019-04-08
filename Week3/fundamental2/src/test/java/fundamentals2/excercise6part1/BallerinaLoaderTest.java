package fundamentals2.excercise6part1;
import fundamentals2.BallerinaLoader;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class BallerinaLoaderTest {
    @Autowired
    BallerinaLoader ballerinaLoader;
    @ParameterizedTest
    @CsvSource({
            "performanceQuality1, 1",
            "performanceQuality2, 3",
            "performanceQuality2, 5"
    })

    void getPerformanceQuality(String name, Integer perfomranceQuantity ) {
    }
}