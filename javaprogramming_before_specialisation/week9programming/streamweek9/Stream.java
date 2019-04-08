package week9programming.streamweek9;

import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    private FileReader reader = new FileReader();
    private List <String> names = getNames();

    public List <String> getNames () {
        return reader.asStream("week9programming/streamweek9/Names.txt")
                .collect(Collectors.toList());
    }
    public List <String> shorterThanFour() {
        return getNames().stream()
                .filter(e-> e.length()<4)
                .collect(Collectors.toList());
    }

    public List <String> namesEndsWithM() {
        return getNames().stream().filter(e-> e.endsWith("m"))
                .map(e->e.toUpperCase())
                .collect(Collectors.toList());
    }

    public List <String> namesWithEOrR() {
        return getNames().stream().filter(e-> e.contains("e"))
                .filter(e->e.contains("r"))
                .collect(Collectors.toList());
    }

//    Create a list with the names that are exactly four characters long, make them lower case,
//    keep those that contain the letters “a” and “m” and duplicate the number of letter “a”s that they have.

    public List <String> namesFourLetters() {
        return getNames().stream().filter(e-> e.length()==4)
                .filter(e->e.contains("a"))
                .filter(e->e.contains("m"))
                .map(e->e.replaceAll("a","aa"))
                .map(e->e.toLowerCase()).collect(Collectors.toList());
    }
}

