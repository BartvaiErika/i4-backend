package week6programming.excercise4week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreedyAlgorithm {
//    Create the GreedyAlgorithm class. It has the change method
// that receives an Integer amount of the cents that the waiter has to give back,
// and it returns a list of Money with the exact coins that he has to give back.

    public List<Money> change (Integer amount) {

        List<Money>change = new ArrayList<>();
        List <Money> kindsOfcoins = coins();

        for (int i = 0; i < kindsOfcoins.size(); i++) {
            Money coin = kindsOfcoins.get(i);
            Integer divisor = coin.centCoin();
            Integer numberOfCoins = amount/divisor;
            for (int j = 0; j < numberOfCoins; j++) {
                change.add(coin);
            }
            amount = amount % divisor;
            //amount = amount-coin.centCoin()*divisor;
        }

        return change;
    }

    public List<Money> coins () {
        List <Money> kindsOfcoins = Arrays.asList(new Cent50(),new Cent20(), new Cent10(),new Cent5(), new Cent2(), new Cent1());
        return kindsOfcoins;
    }
}
