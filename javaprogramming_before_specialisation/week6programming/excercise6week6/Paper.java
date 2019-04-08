package week6programming.excercise6week6;

public class Paper implements Move {

    @Override
    public String getName() {
        return "paper";
    }

    @Override
    public boolean defeats(Move move) {
        return "rock".equalsIgnoreCase(move.getName())||"spock".equalsIgnoreCase(move.getName());
    }
}