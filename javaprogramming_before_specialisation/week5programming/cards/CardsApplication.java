package week5programming.cards;

public class CardsApplication {

    public static void main(String[] args) {

        Crupier crupier = new Crupier();
        DecisionMaker decisionMaker = new DecisionMaker();
        Deck deck = crupier.getDeck();
        Card card = crupier.getOneAtRandom(deck);
        decisionMaker.displayWinner(card);
    }
}
