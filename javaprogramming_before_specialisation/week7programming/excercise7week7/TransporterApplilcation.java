package week7programming.excercise7week7;

import java.util.Scanner;

public class TransporterApplilcation {
    public static void main(String[] args) {

        Transporter transporter = new Transporter();
        System.out.println("How many vehicles type 1 do you have?");
        Scanner scanner = new Scanner(System.in);
        Integer numberOfVehiclesType1 = scanner.nextInt();
        System.out.println("How many vehicles type 2 do you have?");
        Integer numberOfVehiclesType2 = scanner.nextInt();
        System.out.println("How many celebrities have you?");
        Integer numberOfCelebrities = scanner.nextInt();

        if (transporter.canTransport(numberOfVehiclesType1,numberOfVehiclesType2,numberOfCelebrities))
            System.out.println("Yes, it is possible to transport all of them.");
        else
            System.out.println("No, it is not possible to transport all of them.");
    }
}
