package week4programming.excercise3week4;
import java.util.HashMap;
import java.util.Map;

public class BasicIndexApplicationMap {
    public static void main(String[] args) {
        Map<Integer, String> index = new HashMap<>();
        Integer connecting = 1;
        Integer positive = 2;
        Integer economic =3;
        String teaching = "Teaching methods";
        String possitiveThings = "Possitive things";
        String ecologicEconomy = "Ecologic economy";
        index.put(connecting, teaching);
        index.put(positive, possitiveThings);
        index.put(economic, ecologicEconomy);
        System.out.println("My keyset is; "+ index.keySet());
        System.out.println("My keyset is; "+ index.values());
        String crimes = "Crimes";
        index.replace(connecting,crimes);
        System.out.println("Teaching is replaced with crimes. My actual index is: "+ index);
        if (index.containsKey(1))
            System.out.println("Under key 1 in index is; "+
                    index.get(1));
        else System.out.println("Sorry, this book is not available.");
        System.out.println("Index size is: "+  index.size());


    }
}
