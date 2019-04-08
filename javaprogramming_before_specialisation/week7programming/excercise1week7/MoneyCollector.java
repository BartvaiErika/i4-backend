package week7programming.excercise1week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.List;

public class MoneyCollector {

    public List<Integer> paymentsOfFriends () {
        List<Integer> paymentsOfFriends = new ArrayList<>();
        Random random = new Random();
        for (int friends = 0; friends < 10; friends++) {
            Integer payment = random.nextInt(5);
            paymentsOfFriends.add(payment);
        }
        return paymentsOfFriends;
    }



}
