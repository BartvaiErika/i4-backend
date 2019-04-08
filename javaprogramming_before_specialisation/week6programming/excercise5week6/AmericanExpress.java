package week6programming.excercise5week6;

public class AmericanExpress extends Creditcard {

    @Override
    protected String validate(Long cardNumber) {
        String card = cardNumber.toString();
        Integer length = card.length();
        String firstTwoNumber = card.substring(0, 2);
        if (length.equals(15)) {
            if ((firstTwoNumber.equals("34")) || (firstTwoNumber.equals("37"))) {
                return "AMERICAN EXPRESS";
            }
        }
        return "INVALID";

    }
}
