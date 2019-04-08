package week7programming.excercise6week7;

import java.util.List;
import java.util.ArrayList;

        public class SecretHandshakeMovesTranslator {

        public Boolean areEqual(List<String> elements1, List<String> elements2) {
            if (elements1.isEmpty() || elements2.isEmpty())
                return false;

            Integer position = 0;
            while (position < elements1.size()) {
                String element1 = elements1.get(position);
                String element2 = elements2.get(position);
                if (!elements1.equals(elements2)) return false;
                position++;
            }
            return true;
        }   // areEqual

        public  List<String> translateIntoSecretHandshakeMoves(Integer number) {
            List<String> handshakes = new ArrayList<>();
            List<Integer> digits = separate(number);
            System.out.println(digits);

            for (Integer digit: digits) {
                if (isHandshake(digit)) {
                    String handshake = getHandshake(digit);
                    handshakes.add(handshake);
                }
            }

            System.out.println(handshakes);
            return handshakes;
        }   //end translateInto...

        public Boolean isHandshake(Integer digit) {
            List<Integer>specialDigits = new ArrayList<>();
            specialDigits.add(2);
            specialDigits.add(5);
            specialDigits.add(6);
            specialDigits.add(9);
            if (specialDigits.contains(digit)) return true;
            else return false;

        }  //end isHandshake

        public String getHandshake(Integer number) {
            if (number.equals(2))
                return "Thumb touches back";
            else if (number.equals(5))
                return "Thickles over palm";
            else if (number.equals(6))
                return "Bro knock";
            else if (number.equals(9))
                return "Thousend knuckles";
            return "";

        }   //end of getHandshake


        public  List<Integer> separate(Integer number) {
            List<Integer> numbers = new ArrayList<>();
            while (number > 0) {
                Integer unit = number % 10;
                numbers.add(unit);
                number = number / 10;
            }
            System.out.println(numbers);
            numbers = reverse(numbers);
            return numbers;

        }   //end of separate

        public List<Integer> reverse(List<Integer> elements) {
            Integer size = elements.size();
            Integer position = size-1;
            if (size.equals(0))
                return new ArrayList<>();

            List<Integer> reversedElements = new ArrayList<>();

            for (Integer i = position; i>=0; i--) {
                Integer number = elements.get(i);
                reversedElements.add(number);
            }
            return reversedElements;
        }   //end fo reverse

        public void giveSecretAgentTheSecretMission() {
            System.out.println("Give secret agent the secret mission!");
        }

        public void vaporiceImpostorWithLaserRay() {
            System.out.println("Vaporice impostor with laser ray!");
        }

}
