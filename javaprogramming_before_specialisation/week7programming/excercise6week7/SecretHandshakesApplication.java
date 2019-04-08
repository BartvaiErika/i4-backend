package week7programming.excercise6week7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecretHandshakesApplication {
    public static void main(String[] args) {
        SecretHandshakeMovesTranslator secretHandshakeMovesTranslator = new SecretHandshakeMovesTranslator();
        System.out.println("Good evening, how much does this item cost?");
        Scanner scanner = new Scanner(System.in);
        Integer price = scanner.nextInt();

        List<String> rightHandshakes = new ArrayList<>();
        rightHandshakes.add("Thumb touches back");
        rightHandshakes.add("Thickles over palm");
        rightHandshakes.add("Bro knock");
        rightHandshakes.add("Tickles over palm");

        List<String> handshakes = secretHandshakeMovesTranslator.translateIntoSecretHandshakeMoves(price);

        if (handshakes.equals(rightHandshakes))
            secretHandshakeMovesTranslator.giveSecretAgentTheSecretMission();

        else
            secretHandshakeMovesTranslator.vaporiceImpostorWithLaserRay();
    }
}
