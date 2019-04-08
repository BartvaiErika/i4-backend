package week5programming.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Crupier {

    public Card getOneAtRandom(Deck deck) {
        List<Card> cards = deck.getCards();
        Collections.shuffle(cards);
        Card firstCard = cards.get(0);
        return firstCard;
    }

    public Deck getDeck() {
        QueenOfHearts queenOfHearts = new QueenOfHearts();
        KingOfHearts kingOfHearts = new KingOfHearts();
        AceOfSpades aceOfSpades = new AceOfSpades();
        TenOfSpades tenOfSpades = new TenOfSpades();

        List<Card> cards = new ArrayList<>();
        cards = Stream.of(queenOfHearts,kingOfHearts,aceOfSpades,tenOfSpades).collect(Collectors.toList());

        return new Deck(cards);
    }

}