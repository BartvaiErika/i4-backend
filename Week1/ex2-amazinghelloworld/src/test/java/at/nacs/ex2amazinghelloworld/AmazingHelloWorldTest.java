package at.nacs.ex2amazinghelloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AmazingHelloWorldTest {


    @Autowired
    AmazingHelloWorld amazingHelloWorld;

    @Autowired
    AmazingHello amazingHello;

    @Autowired
    AmazingWorld amazingWorld;

    @Test
    void say() {
        String result = amazingHelloWorld.say();

        String expected = "Hello World";
        assertEquals(expected, result);
    }
    @Test
    void sayTwoWords() {
        String result = amazingHello.sayHello()+" "+amazingWorld.sayWorld();
        String expected = "Hello World!";
        assertEquals(expected, result);

    }
}