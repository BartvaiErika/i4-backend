package week4programming.excercise6week4Set;

import java.util.HashSet;
import java.util.Set;

public class AdvancedBackpackApplication {
    public static void main(String[] args) throws Exception {
        Set<Item> Backpack = new HashSet<>();
        System.out.println("Backpack: "+ Backpack);
        Item toothpaste = new Item("toothpaste");
        Item towel = new Item("towel");
        Item underwear = new Item("underwear");

        Backpack.add(toothpaste);
        Backpack.add(towel);
        Backpack.add(underwear);
        System.out.println("Backpack: "+ Backpack);
        Item underwear2 = new Item("underwear");
        Backpack.add(underwear2);
        System.out.println("Backpack with double elements: "+ Backpack);
        for (Item item: Backpack) {
            //System.out.println("Before"+Backpack);
            if (item.equals(item)) {
               // Backpack.remove(item);
                System.out.println("Removed item: " + item.toString());
                System.out.println("Backpack after removing: " + Backpack);

            }


            System.out.println("Backpack size: " + Backpack.size());
         }

    }
}
