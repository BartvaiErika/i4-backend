package week4programming.excercise2week4Set;

import java.util.*;

public class BasicBackpackApplication {
    public static void main(String[] args) {
        Set<String> Backpack = new HashSet<>();
        System.out.println("Backpack: "+ Backpack);
        String toothpaste = "toothpaste";
        String towel = "towel";
        String underwear = "underwear";
        Backpack.add(toothpaste);
        Backpack.add(towel);
        Backpack.add(underwear);
        System.out.println("My Backpacklist is: "+ Backpack);
        System.out.println("Is the towel in the backpack?");
        if (Backpack.contains(towel)) System.out.println("Yes, it is in the backpack.");
        else System.out.println("Sorry, it is not in the backpack!");
        Backpack.remove(towel);
        System.out.println("My Backpacklist is without towel: "+ Backpack);
        System.out.println("Is the towel in the backpack?");
        if (!Backpack.contains(towel)) System.out.println("Sorry, it is not in the backpack!");
        else System.out.println("Yes, it is in the backpack.");
        Backpack.add(underwear);
        Backpack.add(underwear);
        System.out.println("My Backpacklist with 3 underwears: "+ Backpack);
        System.out.println("Backpacksize is" + Backpack.size());

    }
}
