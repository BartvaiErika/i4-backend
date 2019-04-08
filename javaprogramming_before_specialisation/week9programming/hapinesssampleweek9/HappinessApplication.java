package week9programming.hapinesssampleweek9;

import java.util.stream.Stream;
import java.util.Comparator;

public class HappinessApplication {

    public static void main(String[] args) {
        HappinessRecordReader reader = new HappinessRecordReader();
        Stream<String> listOfCountries = reader.asStream("week9programming/hapinesssampleweek9/world-hapiness-2017");
        listOfCountries.skip(1)
                .map(e -> e.split(";"))
                .map(e -> new HappinessRecord(String.valueOf(e[0]), Integer.valueOf(e[1]), Double.valueOf(e[2])))
                .sorted(Comparator.comparing(e -> e.getRank()))
                .limit(5)
                .forEach(e -> System.out.println(e));
    }
}
