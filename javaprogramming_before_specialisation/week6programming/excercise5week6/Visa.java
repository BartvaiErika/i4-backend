package week6programming.excercise5week6;

public class Visa extends Creditcard {

    @Override
    protected String validate(Long cardNumber) {
        String card = cardNumber.toString();
        Integer length = card.length();
        Character firstNumber = card.charAt(0);
        if ((length.equals(13)||length.equals(16))&&(firstNumber.equals("4".charAt(0))))
        { return "VISA";
        }
        return "INVALID";
    }
}
