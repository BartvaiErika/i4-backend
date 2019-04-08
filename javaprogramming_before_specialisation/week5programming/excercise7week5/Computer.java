package week5programming.excercise7week5;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Computer implements Player {
    @Override
    public String getName() {
        return "Player2";
    }

    @Override
    public String getChoice() {
        Random random = new Random();
        int position = random.nextInt(3);
        List<String> moves = Arrays.asList("rock","scissors","paper");
        return moves.get(position);
    }
}