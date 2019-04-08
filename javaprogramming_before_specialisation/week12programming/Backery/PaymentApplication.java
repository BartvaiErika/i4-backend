package week12programming.Backery;

import java.util.List;
import java.util.Optional;

public class PaymentApplication {

    PaymentController paymentController  = new PaymentController();

    public static void main(String[] args) {
        PaymentController controller = new PaymentController();
        PaymentReader reader = new PaymentReader();
        List<Payment> payments = reader.getListOfPayments("week12programming/Backery/payments-lvl5.csv");
        Optional<Integer> day = controller.checkPayment(payments);
        if (day.isPresent()) {
            System.out.println("Number of day John,the baker, got busted: "+ day.get());
        }
    }
}
