package week13programming.parkgarage;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParkgaragenApplication {
    public static void main(String[] args) {
        ParkGarage parkGarage = new ParkGarage();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me your input information! \n" +
                "e.g.:\n" +
                "10 4\n" +
                "6 2 -6 3 4 -3 -4 -2\n" +
                "(firstline: capacity of the garage, single space, booked parking places\n" +
                "secondline: parking place id-s entries and exits separeted by single spaces)");
        String inputFirstline = scanner.nextLine();
        List<String> firstLine = Arrays.asList(inputFirstline.split(" "));
        parkGarage.N = Integer.valueOf(firstLine.get(1));
        parkGarage.M = Integer.valueOf(firstLine.get(0));

        if (parkGarage.N > 200) {
            System.out.println("I'm sorry, the maximal booked parking places are 200. Therefore we count with 200.");
            parkGarage.M = 200;
        }
        if (parkGarage.N < 1) {
            System.out.println("I'm sorry, the minimal booked parking places is 1. Therefore we count with 1.");
            parkGarage.M = 1;
        }
        if (parkGarage.M < parkGarage.N) {
            System.out.println("I'm sorry. The parkgarage capacity is smaller than the number of booked parking places. \n" +
                    "Therefore we count with garage capacity equals the booked parking places.");
            parkGarage.M = parkGarage.N;
        }

        String inputSecondline = scanner.nextLine();
        List<String> secondLines = Arrays.asList(inputSecondline.split(" "));

        Predicate<Integer> isNegativ = n -> n < 0;
        Predicate<Integer> biggerThan2000 = b -> b > 2000;
        List<Integer> entryIds = secondLines.stream()
             //   .mapToInt(e->e)
                .map(e->Integer.valueOf(e))
                .filter(isNegativ.negate())
                .sorted()
                .collect(Collectors.toList());
        List<Integer> exitIds = secondLines.stream()
                .map(e->Integer.valueOf(e))
         //       .mapToInt(e->e)
                .filter(isNegativ)
                .sorted()
                .collect(Collectors.toList());
        entryIds.stream().filter(biggerThan2000)
                .forEach(e->System.out.println("Only IDs smaller than 2000 are allowed! " + e));
        entryIds.stream().filter(e->e>2000).forEach(e->entryIds.remove(e));
        exitIds.stream().filter(biggerThan2000)
                .forEach(e->System.out.println("Only IDs smaller than 2000 are allowed" + e));
        exitIds.stream().filter(e->e>2000).forEach(e->entryIds.remove(e));
        exitIds.stream().forEach(e->Math.abs(e));
        Long G = Stream.of(entryIds).filter(e->entryIds.contains(exitIds)).count();

        System.out.println("Positive numbers: "+ entryIds);
        System.out.println("Negative numbers: "+ exitIds);
        System.out.println("There are " + G + " parking places occupied at the same time.");

    }
}
