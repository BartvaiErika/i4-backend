package week2programming.Reflection2Erika;

import java.util.ArrayList;
import java.util.List;

public class PostOfficeApplication {

       public static void main(String[] args) {
           Letter letter = new Letter("Fake address 123");
           PostOfficeAssistant assistant = new PostOfficeAssistant();
           assistant.stamp(letter);
           assistant.send(letter);

           List<Letter> letters = new ArrayList<>();
           letters.add(new Letter("Fake address 345"));
           letters.add(new Letter("Fake address 567"));
           letters.add(new Letter("Fake address 890"));

           Postman postman = new Postman(letters);
           postman.deliver();

       }
}
