package week13programming;

import java.util.*;

public class WrongEvauations {
    public static void main(String[] args) {
        Map<Integer,List<Integer>> evaluation = new HashMap<Integer, List<Integer>>();
        Integer secondNumber = 0;
        evaluation.put(0,Arrays.asList(0,6,9));
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
        System.out.println("Please give me your equalitation! (e.g.: 3=2)");
        String input = scanner.next();
        Integer firstNumber = Integer.valueOf(input.charAt(0));
        Integer secondPart = Integer.valueOf(input.charAt(2));
        if (evaluation.containsKey(firstNumber)) {
            List <Integer> possibleChanges =  evaluation.get(firstNumber);
            if (possibleChanges.contains(secondPart)) {
                Integer position = possibleChanges.indexOf(secondPart);
                secondNumber = possibleChanges.get(position++);
            }
        }
            System.out.println("Output: " + firstNumber + "=" + secondNumber);

    }
}
