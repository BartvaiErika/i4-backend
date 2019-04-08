package week6programming.excercise5week6;

public class Credit {
    public String credit (Long cardNumber) {

        AmericanExpress americanExpress = new AmericanExpress();
        MasterCard masterCard = new MasterCard();
        Visa visa = new Visa();

        //378282246310000
        if (!americanExpress.validate(cardNumber).equals("INVALID")) {
            return "American Express";
        }
        else if (!masterCard.validate(cardNumber).equals("INVALID")) {
            return "Mastercard";
        }
        else if (!(visa.validate(cardNumber).equals("INVALID"))) {
            return "VISA";
        }
        return "INVALID";
    }
}
