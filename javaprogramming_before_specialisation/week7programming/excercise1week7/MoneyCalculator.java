package week7programming.excercise1week7;
import java.util.List;

public class MoneyCalculator {
//    A MoneyCalculator that receives money numbers and returns the accumulated value

    public Integer calculate(List<Integer> paymentsOfFriends) {
        Integer sum=0;
        for (Integer payment: paymentsOfFriends) {
            sum =sum+payment;
        }
        return sum;
    }
}
