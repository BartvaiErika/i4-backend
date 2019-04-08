package Week8;

import java.util.List;
import java.util.function.Function;

public class PowerLevelScouter {
//    Add to it the scout method that receives a name and returns its power level as a number.
// The power is calculated by summing up the ASCII code value of each letter.
//    Add to it the scoutEnhanced method that receives a name and returns its power level as a number.
// The power is calculated by transforming the name to lowercase and then summing up the ASCII
// code value of each letter.
    public Integer scout (String name){
        return calculate(name, n -> summingUp(n));
    }
    public Integer enhancedScout (String name) {
        return calculate(name, n -> summingUp(n.toLowerCase()));

    }

    protected Integer summingUp (String name) {
        Integer sum = 0;
        for (int i = 0; i < name.length(); i++) {
            Character letter = name.charAt(i);
            Integer ascii = (int) letter;
            sum +=ascii;
        }
        return sum;
    }
    private Integer calculate (String name, Function<String, Integer> transformation)     {
        Integer apply = transformation.apply(name);
        return apply;


    }
}
