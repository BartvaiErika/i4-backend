package week12programming.Backery;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PaymentController {


    //List<Payment> read as a list from PaymentReader

    public Optional<Integer> checkPayment(List<Payment> payments) {
        return payments.stream()
                .filter(e -> !e.getEarning().equals(e.getBankPayment()))
                .map(Payment::getDay)
                .findFirst();
    }

}
