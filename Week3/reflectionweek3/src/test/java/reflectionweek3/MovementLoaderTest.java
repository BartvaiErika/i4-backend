package reflectionweek3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertTrue;

@SpringBootTest
class MovementLoaderTest {

    @Autowired
    MovementLoader movementLoader;
    @Test
    void MovementLoadertest () {
    Map<Integer,String> actual = movementLoader.getMovement();
    int actualsize= actual.size();
    Assertions.assertEquals(5,actualsize);
    }

    @ParameterizedTest
    @CsvSource( {
            "2,thumb touches back",
            "3,little finger grab",
            "5,tickles over palm",
            "6,bro knock",
            "9,thousand knuckles"
    })

    void testMovement(Integer number, String name) {
        Map<Integer, String> actualHandShakes = movementLoader.getMovement();
        System.out.println(actualHandShakes);
        Set<Integer> numbers = actualHandShakes.keySet();
        Collection<String> names = actualHandShakes.values();
        System.out.println(names);

        assertTrue(numbers.contains(number));
        assertTrue(names.contains(name));
    }

}