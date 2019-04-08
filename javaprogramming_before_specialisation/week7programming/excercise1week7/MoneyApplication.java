package week7programming.excercise1week7;

import java.util.List;

public class MoneyApplication {

    public static void main(String[] args) {
        MoneyCollector moneyCollector = new MoneyCollector();
        List<Integer> paymentsOfFriends = moneyCollector.paymentsOfFriends();
        MoneyCalculator moneyCalculator = new MoneyCalculator();
        Integer friendsNumber = 1;
        for (Integer payment: paymentsOfFriends) {
            System.out.println("Friend " + friendsNumber +" :" + payment + " Euro.");
            friendsNumber++;
        }

      System.out.println("Collected summary: "+ moneyCalculator.calculate(paymentsOfFriends) );
    }
}
