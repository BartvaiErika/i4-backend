package paarProgramming;


import paarProgramming.controller.PairMaker;
import paarProgramming.controller.ParticipantReader;
import paarProgramming.model.Pair;
import paarProgramming.model.Participant;
import paarProgramming.view.Screen;

import java.util.List;

public class PaarCreatingApplication {
    public static void main(String[] args) {
        List<Participant> participants = ParticipantReader.asList("paarProgramming/file/participants.txt");
        List<Pair> pairs = PairMaker.make(participants);
        Screen.display(pairs);
    }
}
//public class FruitShopApp {
//    public static void main(String[] args) {
//        List<String> fruitNames = DeliveryInformation.getInformation("beweek1/reflection1/file/delivery.txt");
//        List<Fruit> fruits = Assistant.translate(fruitNames);
//        FruitCounter.display(fruits);
//    }
//}