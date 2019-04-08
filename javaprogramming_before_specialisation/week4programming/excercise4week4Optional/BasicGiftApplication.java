package week4programming.excercise4week4Optional;

import java.util.Optional;

public class BasicGiftApplication {
    public static void main(String[] args) {
        Optional<String> giftBox = Optional.empty();
        System.out.println("Gift: " + giftBox);
        String roboToy = "roboToy";
        giftBox = Optional.of(roboToy);
        System.out.println("Gift: " + giftBox);
        System.out.println("Is a roboToy in the giftbox?");
        if (giftBox.isPresent()) System.out.println("Yes, a robotoy is in the giftbox.");
        else System.out.println("Sorry, there is no robotoy is in the giftbox.");
        System.out.println("The gift is a "+giftBox.get()+".");



    }
}
