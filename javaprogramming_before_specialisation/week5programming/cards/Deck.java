package week5programming.cards;

import java.util.ArrayList;
import java.util.List;
// Deck= Kartenstapel
public class Deck {

    private List<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getCards() {
        return new ArrayList<>(cards);
    }
}

