package week6programming.excercise5week6;

public class MasterCard extends Creditcard {

    @Override
    protected String validate(Long cardNumber) {
        String card = cardNumber.toString();
        Integer length = card.length();
        String firstTwoNumber = card.substring(0,2);
        if ((length.equals(16))&&(firstTwoNumber.equals("51"))||(firstTwoNumber.equals("52"))||(firstTwoNumber.equals("53"))||(firstTwoNumber.equals("54"))||(firstTwoNumber.equals("55")))
            return "MASTERCARD";
        else return "INVALID";
    }

}
