package week11programming.militaryTime;

import week11programming.militaryTime.ToMilitaryTime;

import java.util.Scanner;

public class ToMilitaryTimeApplication

{
    public static void main(String[] args) {
        ToMilitaryTime toMilitaryTime = new ToMilitaryTime();
        System.out.println("Please give me your time with AM or PM! ");
        Scanner scanner = new Scanner(System.in);
        String militaryTime = scanner.next();
        System.out.println(toMilitaryTime.toMilitaryTime(militaryTime));

    }
}
