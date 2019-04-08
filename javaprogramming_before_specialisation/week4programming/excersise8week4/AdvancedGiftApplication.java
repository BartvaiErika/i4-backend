package week4programming.excersise8week4;

import java.util.Optional;

public class AdvancedGiftApplication {
    public static void main(String[] args) {

        Optional<Box> giftBox = Optional.empty();
        System.out.println("Gift: "+giftBox.get());
        Box present = new Box("roboToy");

        Optional<Box> box = Optional.of(present);
        if (giftBox.isPresent())
            System.out.println("There is a present in the gift box.");

        System.out.println("The gift is a content="+giftBox.toString());
    }
}
