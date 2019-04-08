package week5programming.cards;

import java.util.Map;
import java.util.HashMap;

public class DecisionMaker {
    private Map<CardType, String> winningResults;

    public DecisionMaker() {
        this.winningResults = new HashMap<>();
        winningResults.put(CardType.QUEEN_OF_HEARTS, "Player1");
        winningResults.put(CardType.KING_OF_HEARTS, "Player2");
        winningResults.put(CardType.ACE_OF_SPADES, "Player3");
    }

    public void displayWinner(Card card) {
        CardType name = card.getName();
        System.out.println("The card is: " + name);
        String winner = winningResults.get(name);
        if (winner == null) {
            System.out.println("Nobody wins...");
            return;
        }
        System.out.println(winner + " wins!");
        System.out.println("The card number is: " + card.getName().getNumber());
    }

}
