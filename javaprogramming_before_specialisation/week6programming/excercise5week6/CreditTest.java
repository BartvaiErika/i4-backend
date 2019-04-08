package week6programming.excercise5week6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreditTest {

    @Test
    void credit() {
        AmericanExpress americanExpress = new AmericanExpress();
        MasterCard masterCard = new MasterCard();
        Visa visa = new Visa();
        String expectedMasterCard = "MASTERCARD";
        String expectedVisa = "VISA";
        String expectedAmericanExpress = "AMERICAN EXPRESS";
        String expectedInvalid = "INVALID";
        String actuellMastercard = masterCard.validate(5182822463100000L);
        String actuellVisa = visa.validate(4000000000000L);
        String actuellAmericanExpress = americanExpress.validate(340000000000000L);
        String actuellInvalid = masterCard.validate(5682822463100000L);

        Assertions.assertEquals(expectedAmericanExpress, actuellAmericanExpress);
        Assertions.assertEquals(expectedMasterCard, actuellMastercard);
        Assertions.assertEquals(expectedVisa, actuellVisa);
        Assertions.assertEquals(expectedInvalid, actuellInvalid);

    }
}

//    protected String getCreditCardNumber() {
//        List<String> CreditCardNumbers = Arrays.asList("378282246310005","371449635398431");
//        Collections.shuffle(CreditCardNumbers);
//        String creditCardNumber = CreditCardNumbers.get(0);
//        return creditCardNumber;}*/
//
//    MasterCardprotected String getCreditCardNumber() {
//        List<String> CreditCardNumbers;
//        CreditCardNumbers = Arrays.asList("2221000000000009","2223000048400011","2223016768739313","5555555555554444",
//                "5105105105105100");
//        Collections.shuffle(CreditCardNumbers);
//        String creditCardNumber = CreditCardNumbers.get(0);
//        return creditCardNumber;
//    }*/
//    Visa
//
//    protected String getCreditCardNumber() {
//        List<String> CreditCardNumbers;
//        CreditCardNumbers = Arrays.asList("4111111111111111","4012888888881881","4222222222222");
//        Collections.shuffle(CreditCardNumbers);
//        String creditCardNumber = CreditCardNumbers.get(0);
//        return creditCardNumber;
//    }*/

