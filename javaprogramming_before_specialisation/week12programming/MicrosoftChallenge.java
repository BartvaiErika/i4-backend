package week12programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MicrosoftChallenge {

    protected static Integer getNumberOfPermutations(List<Integer> integers) {
        Integer f = 0;
        for (Integer number : integers) {
            for (int i = 1; i < integers.size(); i++) {
                f = number * i;
            }
        }
        return f;
    }

        public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        List<Integer> digits = Arrays.stream(ints).boxed().collect(Collectors.toList());
        System.out.println("Digits: " + digits);
        ArrayList<Integer> permutation = new ArrayList<Integer>();
        List<List<Integer>> permutations = new ArrayList<List<Integer>>();
        Integer factor = getNumberOfPermutations(digits);
        System.out.println("Number of possible permutations without repitition: "+ factor);

        Integer apperiences = factor/digits.size();
        Random random = new Random();
        for (int j = 1; j < factor; j++) {
            for (int i = 1; i < digits.size(); i++) {
                ArrayList<Integer> listRandomNumbers = new ArrayList<Integer>(digits.size());
                Integer number = random.nextInt(digits.size())+1;

                if (!listRandomNumbers.contains(number))
                    listRandomNumbers.add(number);
                else break;
                permutation.addAll(listRandomNumbers);
                System.out.println(permutation);
            }
            if (!permutations.contains(permutation))
                permutations.add(permutation);
        }
        System.out.println("Permutations: ");
        permutations.stream().forEach(e->System.out.println(e));

    }

}
