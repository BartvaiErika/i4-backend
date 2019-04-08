//Created by Erika
package week2programming.excercise2week2;
import java.util.Scanner;

public class DoorApplication {
    public static void main(String[] args) {
        System.out.println("What is your doornumber?");
        Scanner scanner = new Scanner(System.in);
        Integer doorNumber = scanner.nextInt();
        Door door = new Door(doorNumber);
        Key myKey = new Key();
        myKey.openTheDoor(door);
    }
}

