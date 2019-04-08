package at.nacs.ex2amazinghelloworld;

import org.springframework.stereotype.Component;
@Component
public class AmazingHelloWorld {

    AmazingHello amazingHello;
    AmazingWorld amazingWorld;

    public String getMessage() {
        return amazingHello.sayHello()+" "+amazingWorld.sayWorld();
    }

    public String say() {
        return "Hello World!";
    }
}

