package week7programming.excercise8week7;

public class RoemerNumberConverter {

    public Integer convertRomanNumberToArabic(String romanNumber) {
        int Arabic = 0;
        int last_digit = 0;
        int current_digit = 0;
        for (int i = 0; i < romanNumber.length(); i++) {
            //  String roman = romanNumber.substring(i);
            //  if (roman.equals("I")) current_digit = 1;
            if (romanNumber.charAt(i) == 'I') {
                current_digit = 1;
            }
            if (romanNumber.charAt(i) == 'V') {
                current_digit = 5;
            }
            if (romanNumber.charAt(i) == 'X') {
                current_digit = 10;
            }
            if (romanNumber.charAt(i) == 'L') {
                current_digit = 50;
            }
            if (romanNumber.charAt(i) == 'C') {
                current_digit = 100;
            }
            if (romanNumber.charAt(i) == 'D') {
                current_digit = 500;
            }
            if (romanNumber.charAt(i) == 'M') {
                current_digit = 1000;
            }
            System.out.println("Arabic: " + Arabic);
            if ((last_digit < current_digit) && (last_digit != 0)) {
                current_digit -= last_digit;
                Arabic -= last_digit;
                Arabic += current_digit;
                last_digit = current_digit;
                current_digit = 0;
            } else {
                last_digit = current_digit;
                Arabic += current_digit;
                current_digit = 0;
            }
            System.out.println("Arabic2: " + Arabic);
        }
        return Arabic;
    }
}
//    public class RomanArabicConverter {
//        public boolean isValidArabic(int x) {
//            String num = String.valueOf(x);
//            for (int k = 0; k < num.length(); k++) {
//                if (Character.isDigit(num.charAt(k)) == false) {
//                    return false;
//                }
//            }
//            if (x > 3999 || x < 1) {
//                return false;
//            }
//            return true;
//        }


