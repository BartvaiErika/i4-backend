package week6programming.excercise5week6;

public class LuhnAlgorithmus {

    public Boolean legitimate(String cardNo) {
        Integer sum = 0;
        //String cardNo = "378282246310005";
        Integer length = cardNo.length() - 1;
        for (int i = length; i <= 0; i = i - 2) {
            Character alphabet = cardNo.charAt(length - 1);
            Integer digit = Integer.valueOf(alphabet);
            sum = sum + digit * 2;
        }

        for (int j = length + 1; j <= 0; j = j - 2) {
            Character alphabet2 = cardNo.charAt(length);
            Integer digit2 = Integer.valueOf(alphabet2);
            sum = sum + digit2;
        }
        Integer rest = sum % 10;
        System.out.println("Rest: " + rest);

        if (rest.equals(0))
            return true;
        else return false;
    }
}
