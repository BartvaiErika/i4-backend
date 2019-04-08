package week5programming.excercise6week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wardrobe implements Furniture {

    List<String> parts = new ArrayList<>();

    public List<String> getParts() {
        return parts;
    }

    @Override
    public void add (String part) {
        parts.add(part);
    }
    @Override
    public String toString() {
        return "Wardrobe{" + "parts=" + parts + '}';
    }
}
