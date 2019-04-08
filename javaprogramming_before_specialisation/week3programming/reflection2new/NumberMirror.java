//Created by Erika
package week3programming.reflection2new;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;


public class NumberMirror {
    public Integer mirror (Integer number) {
        String numberAsString= number.toString();
        ArrayList<String> numbersAsString = new ArrayList<String>();

       Integer length = numberAsString.length();

       for (int i=0; i <length;i++) {
          Character letter = numberAsString.charAt(i);
          numbersAsString.add(letter.toString());
       }

       Collections.reverse(numbersAsString);

        String backwards = join(numbersAsString);
        Integer backwardsNumber = Integer.parseInt(backwards);

       return backwardsNumber;
    }

    public String join(List<String> list) {
        int len = list.size();
        if (len == 0)
            return "";
        StringBuilder sb = new StringBuilder(list.get(0).toString());
        for (int i = 1; i < len; i++) {
            sb.append(list.get(i).toString());
        }
        return sb.toString();
    }

    public NumberMirror specialMirror (Integer number) {
        Integer specialNumber = mirror(number);
        return specialMirror(specialNumber);
    }
}
