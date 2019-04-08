package week10programming.Sms;

public class SmsApplication {
    public static void main(String[] args) {
        SmsSummerizer smsSummerizer = new SmsSummerizer();
        System.out.println(smsSummerizer.getMostUsedHamWord());
    }
}
