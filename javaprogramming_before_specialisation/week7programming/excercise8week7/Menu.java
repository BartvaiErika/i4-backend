package week7programming.excercise8week7;
import java.util.HashMap;
import java.util.Map;

public class Menu {
    public Map<Integer, String> Menu () {
        Map <Integer, String> menu = new HashMap<>();
        menu.put(1,"From number to Roman numeral");
        menu.put(2,"From Roman numeral to number");
        menu.put(3,"Exit");
        return menu;
    }
}
