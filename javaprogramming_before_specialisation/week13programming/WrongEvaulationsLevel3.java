package week13programming;

import java.util.*;

public class WrongEvaulationsLevel3 {
    public static void main(String[] args) {
        Map<Integer,List<Integer>> evaluationAdd = new HashMap<Integer, List<Integer>>();
        Map<Integer,List<Integer>> evaluationRemove = new HashMap<Integer, List<Integer>>();
        Integer secondNumber = 0;
        Integer result=0;
        Integer firstNumber = 0;
        evaluationAdd.put(0, Arrays.asList(8));
        evaluationAdd.put(1,Arrays.asList(7));
        evaluationAdd.put(3,Arrays.asList(9));
        evaluationAdd.put(4,Arrays.asList(4));
        evaluationAdd.put(5,Arrays.asList(6,9));
        evaluationAdd.put(6,Arrays.asList(8));
        evaluationAdd.put(9,Arrays.asList(8));

        evaluationRemove.put(6,Arrays.asList(5));
        evaluationRemove.put(7,Arrays.asList(1));
        evaluationRemove.put(8,Arrays.asList(0,6,9));
        evaluationRemove.put(9,Arrays.asList(3,5));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me your equalitation! (e.g.: 8-6=8)");
        String input = scanner.next();

        List <Integer> possibleChangesAdd = new ArrayList<>();
        List <Integer> possibleChangesRemove = new ArrayList<>();

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
//        possibleChangesAdd =  evaluationAdd.get(result);
//        for (Integer possibleChangeAdd : possibleChangesAdd) {
//            if (possibleChangeAdd.equals(firstNumber + secondNumber))
//                System.out.println(possibleChangeAdd + "=" + firstNumber + "+" + secondNumber);
//        }
//        possibleChanges =  evaluation.get(firstNumber);
//        for (Integer possibleChange : possibleChanges) {
//            if (possibleChange.equals(result - secondNumber))
//                System.out.println(result + "=" + possibleChange + "+" + secondNumber);
//        }
//        possibleChanges =  evaluation.get(secondNumber);
//        for (Integer possibleChange : possibleChanges) {
//            if (possibleChange.equals(result - firstNumber))
//                System.out.println(result + "=" + secondNumber + "+" + possibleChange);
//        }

    }

}
