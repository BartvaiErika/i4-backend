package week7programming.excercise2week7;
import java.util.Scanner;

public class NickNameCreator {
    public static void main(String[] args) {
        System.out.println("Please give me your name!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Your name is: "+ name);
        Integer halfOfName =  name.length()/2;
        String nickname = name.substring(0,halfOfName);
        System.out.println("Your nickname is: " + nickname);
    }

}
