package week7programming.excercise3week7;
import java.util.Arrays;
import java.util.List;

public class NumberApplication {
    public static void main(String[] args) {
        NumberInspector numberInspector = new NumberInspector();
        List<Integer> numbers = Arrays.asList(456,555,434,532,632,347,542,334,12,634,134,342,6756);
        System.out.println("Numbers: "+numbers);
        System.out.println("Biggest: " + numberInspector.biggest(numbers));
        System.out.println("Smallest: " +numberInspector.smallest(numbers));

    }
}
