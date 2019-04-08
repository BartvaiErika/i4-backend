package fundamentals2.excercise6part1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DaysTest {
    @Autowired
    Days days;

    @Test
    void getDaysTest() {
    int actual = days.getDays();
    Assertions.assertEquals(369,actual);
    }
}