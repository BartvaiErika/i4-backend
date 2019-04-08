package week9programming.streamweek9;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsApplication {
    public static void main(String[] args) {
        List <Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        List<Integer> evenNumbers = numbers.stream()
                .filter(e-> e % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers:" + evenNumbers);
        List<Integer> oddNumbers = numbers.stream().filter(e-> e % 2 != 0).collect(Collectors.toList());
        System.out.println("Odd numbers:" + oddNumbers);

        List <Integer> numberDivisibleByThree = numbers.stream().filter(e->e%3 ==0).filter(e->e>10)
                .collect(Collectors.toList());

        System.out.println("Numbers divisible by 3 and bigger than 10: " + numberDivisibleByThree);

        List <Integer> numberSmallerThanFive = numbers.stream().filter(e->e<5).map(e-> e*3).
                collect(Collectors.toList());
        System.out.println("Numbers smaller than 5 and multiplied by 3: "+numberSmallerThanFive );

         List <String> numbersAsString = numbers.stream().filter(e -> e > 8).filter(e -> e < 12)
                 .map(e->"number "+ e + " has " + e.toString().length()+ " digits").collect(Collectors.toList());
         System.out.println(numbersAsString);
         System.out.print(numbersAsString);
           //     .forEach(e -> System.out.println("number "+ e+ " has " + e.toString().length()+ " digits."));

    }
}
//[number 9 has 1 digits, number 10 has 2 digits, number 11 has 2 digits]
//    Digits of numbers bigger than 8 and smaller than 12:
//        [number 9 has 1 digits, number 10 has 2 digits, number 11 has 2 digits]
//    Create a list of the numbers smaller than 5 and multiply them by 3. Display it.
//    Create a list of String where every element follows the format “number <number> has <digit> digits”.
//    The numbers considered have to be bigger than 8 and smaller than 12. Display it.

