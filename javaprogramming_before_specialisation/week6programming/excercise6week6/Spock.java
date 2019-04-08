package week6programming.excercise6week6;

public class Spock implements Move {

    @Override
    public String getName() {
        return "spock";
    }

    @Override
    public boolean defeats(Move move) {
        return "scissors".equalsIgnoreCase(move.getName())||"rock".equalsIgnoreCase(move.getName());
    }

}
