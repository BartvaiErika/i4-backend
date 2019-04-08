//Created by Erika
package week3programming.excercises3week3;

public class NumberCorrector {
    public Integer correct (Double weight) {
        if (weight <= 0) System.out.println("Wrong weight!");
        weight = Math.floor(weight);
        Integer correctedWeight = weight.intValue();
        return correctedWeight;

    }
}
