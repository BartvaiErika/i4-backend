package week6programming.excercise6week6;

public class Lizard implements Move {
    @Override
    public String getName() {
        return "lizard";
    }

    @Override
    public boolean defeats(Move move) {
        return "lizard".equalsIgnoreCase(move.getName())||"paper".equalsIgnoreCase(move.getName());




    }
}
