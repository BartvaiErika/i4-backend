package week4programming.excercise7week4ListMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvancedIndexApplication {
    public static void main(String[] args) {
        List <Topic> topics1 = new ArrayList<>();
        List <Topic> topics2 = new ArrayList<>();
        Map<Integer, List <Topic>> index = new HashMap<>();
        System.out.println("My empty index: " + index);
        Integer pageNumber1 = 1;
        Integer pageNumber2 = 2;
        Topic teaching = new Topic("Teaching methods");
        Topic positiveThings = new Topic("Positive things");
        Topic ecologicEconomy = new Topic("Ecologic economy");

        topics1.add(teaching);
        topics2.add(positiveThings);
        topics2.add(ecologicEconomy);

        index.put(pageNumber1,topics1);
        index.put(pageNumber2,topics2);

        System.out.println("Topics1"+topics1.toString());
        System.out.println("Topics2"+topics2.toString());

        Topic crimes = new Topic("Crimes");
        index.remove(topics1);
        topics1.add(crimes);
        System.out.println("Index: "+ index.toString());
        if (index.containsKey(1))
            System.out.println("Under key 1 in index is; "+
                    index.get(1));
        else System.out.println("Sorry, this topic is not available.");
        if (index.containsValue(crimes))
            System.out.println("Under this value in this index is; "+
                    index.get(1));
        else System.out.println("Sorry, this topic is not available in this index.");

        System.out.println("Index size is: "+  index.size());
    }
}
