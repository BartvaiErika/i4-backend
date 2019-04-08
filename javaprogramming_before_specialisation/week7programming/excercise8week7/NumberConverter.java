package week7programming.excercise8week7;

public class NumberConverter {

    public String convertArabictoRoman(int number) {

        RoemerNumberValidator roemerNumberValidator = new RoemerNumberValidator();

            String Roman = "";
            String onesArray[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
            String tensArray[] = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            String hundredsArray[] = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
            int ones = number % 10;
            number = (number - ones) / 10;
            int tens = number % 10;
            number = (number - tens) / 10;
            int hundreds = number % 10;
            number = (number  - hundreds) / 10;
            for (int i = 0; i < number ; i++) {
                Roman += "M";
            }
            if (hundreds >= 1) {
                Roman += hundredsArray[hundreds - 1];
            }
            if (tens >= 1) {
                Roman += tensArray[tens - 1];
            }
            if (ones >= 1) {
                Roman += onesArray[ones - 1];
            }
            return String.valueOf(Roman);
        }

    }




