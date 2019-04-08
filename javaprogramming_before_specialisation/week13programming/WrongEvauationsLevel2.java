package week13programming;

import java.util.*;

public class WrongEvauationsLevel2 {
    public static void main(String[] args) {
        Map<Integer,List<Integer>> evaluation = new HashMap<Integer, List<Integer>>();
        Integer secondNumber = 0;
        Integer result=0;
        Integer firstNumber = 0;
        evaluation.put(0, Arrays.asList(0,6,9));
        evaluation.put(1,Arrays.asList(1));
        evaluation.put(2,Arrays.asList(2,3));
        evaluation.put(3,Arrays.asList(2,3,5));
        evaluation.put(4,Arrays.asList(4));
        evaluation.put(5,Arrays.asList(3,5));
        evaluation.put(6,Arrays.asList(0,6,9));
        evaluation.put(7,Arrays.asList(7));
        evaluation.put(8,Arrays.asList(8));
        evaluation.put(9,Arrays.asList(0,6,9));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me your equalitation! (e.g.: 8+8=8)");
        String input = scanner.next();
        List <Integer> possibleChanges = new ArrayList<>();
        if (input.charAt(1) == '=') {
            result = Integer.valueOf(input.charAt(0));
            secondNumber = Integer.valueOf(input.charAt(2));
            firstNumber = Integer.valueOf(input.charAt(4));
        }
        else {
            firstNumber = Integer.valueOf(input.charAt(0));
            secondNumber = Integer.valueOf(input.charAt(4));
            result = Integer.valueOf(input.charAt(2));
        }
        possibleChanges =  evaluation.get(result);
        for (Integer possibleChange : possibleChanges) {
            if (possibleChange.equals(firstNumber + secondNumber))
                System.out.println(possibleChange + "=" + firstNumber + "+" + secondNumber);
        }
        possibleChanges =  evaluation.get(firstNumber);
        for (Integer possibleChange : possibleChanges) {
            if (possibleChange.equals(result - secondNumber))
                System.out.println(result + "=" + possibleChange + "+" + secondNumber);
        }
        possibleChanges =  evaluation.get(secondNumber);
        for (Integer possibleChange : possibleChanges) {
            if (possibleChange.equals(result - firstNumber))
                System.out.println(result + "=" + secondNumber + "+" + possibleChange);
        }

    }

}
