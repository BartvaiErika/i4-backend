package Week8.LSolutions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PowerLevelScouter {


    public Integer scout(String name) {
        return scout(name, letter -> (int) letter.charAt(0));
    }

    public Integer scoutEnhanced(String name) {
        return scout(name, letter -> (int) letter.toLowerCase().charAt(0));
    }

    private Integer scout(String name, Function<String, Integer> scouter) {
        List<String> letters = Arrays.asList(name.split(""));
        Integer total = 0;
        for (String letter : letters) {
            Integer powerLevel = scouter.apply(letter);
            total += powerLevel;
        }
        return total;
    }
}
