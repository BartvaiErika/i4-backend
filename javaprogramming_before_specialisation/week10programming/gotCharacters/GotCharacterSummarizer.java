package week10programming.gotCharacters;

import java.util.*;
import java.util.stream.Collectors;

public class GotCharacterSummarizer {

    protected static CharacterReader characterReader = new CharacterReader();
    protected static List<GotCharacter> listOfGotCharacter = characterReader.toGotCharacterRecord();

    public static void main(String[] args) {
        System.out.println("How many characters appear in the books in total? "
                + appearingCharactersOfBook());
        System.out.println("How many characters died? " + diedCharacters());
        System.out.println("Percentage of died womens in all books: " +
                percentageOfDiedWomens()
                + " % and percentage of died mens in all books: "
                + percentageOfDiedMens() + " %.");
        System.out.println("Which book has the biggest death count with how many? "
                + biggestDeathCount());
        System.out.println("Who died in that book? " + nameOfDiedPersonOfBook());
        System.out.println("Which two allegiances have the biggest dead count? "
                + allergiancesWithBiggestDeadCount());
        System.out.println("Which percentage of deaths belong to nobility characters? ");
        System.out.println(percentageDeathsToNobility());
        System.out.println("In which book die the most amount of characters from the Stark allegiance? "
                + bookWithMostDiedCharactersFromStark());
        System.out.println("In which book die the most amount of characters from the Lannister allegiance? "
                + numberOfDiedLannisters());
        System.out.println("How many Starks have died? " + numberDiedStarks());
        System.out.println("How many Lannisters have died? " + numberOfDiedLannisters());
        System.out.println("Is there any character who didn’t die? " + didntDiedCharacters());
    }

    //    How many characters appear in the books in total?
    public static Long appearingCharactersOfBook() {
        return listOfGotCharacter.stream()
                .count();
    }

    //    How many characters died?
    public static Long diedCharacters() {
        return listOfGotCharacter.stream()
                .filter(e -> e.getBookOfDeath().equals(""))
                .count();
    }

    //    Display the overall percentage of men that died in all books.
    public static long percentageOfDiedMens() {
        return listOfGotCharacter.stream()
                .filter(e -> e.getGender().equals(1))
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .count();
    }

    //    Display the overall percentage of women that died in all books.
    public static Long percentageOfDiedWomens() {
        return listOfGotCharacter.stream()
                .filter(e -> e.getGender().equals(0))
                .filter(e -> !(e.getBookOfDeath().isEmpty()))
                .map(e -> e.getGender().equals(0))
                .count();
    }

//    Which book has the biggest death count with how many?
    public static String biggestDeathCount(){
        return listOfGotCharacter.stream()
                .collect(Collectors.groupingBy(GotCharacter::getBookOfDeath, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> !e.getKey().isEmpty())
                .max((e1, e2) -> (e2.getValue().compareTo(e1.getValue())))
                .map(e -> "book=> " + e.getKey() + "; death count=> " + e.getValue())
                .get();
    }
//    Who died in that book?
    public static String nameOfDiedPersonOfBook() {
        return listOfGotCharacter.stream()
                .filter(e -> e.getBookOfDeath().equals("299"))
                .map(e -> nameOfDiedPersonOfBook())
                .collect(Collectors.toList()).toString();
    }

//    Which ones are the two allegiances that have the biggest dead count?
    public static List<String> allergiancesWithBiggestDeadCount() {
        return listOfGotCharacter.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .sorted((e1, e2) -> e2.getBookOfDeath().compareTo(e1.getBookOfDeath()))
                //.sorted(Comparator.comparing(GotCharacter::getBookOfDeath).reversed())
                .limit(2)
                .map(e -> e.getAllegiances())
                .collect(Collectors.toList());
    }

//     Which percentage of deaths belong to nobility characters?
    public static List<String> percentageDeathsToNobility() {
        return listOfGotCharacter.stream()
                .collect(Collectors.groupingBy(GotCharacter::getNobility, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> !e.getKey().equals(0))
                .sorted((e1, e2) -> (e2.getValue().compareTo(e1.getValue())))
                .map(e -> "nobility->" + e.getKey() + " death-> " + e.getValue()+" % ")
                .collect(Collectors.toList());
    }
//    In which book die the most amount of characters from the Stark allegiance?
    public static List<String> bookWithMostDiedCharactersFromStark() {
        return listOfGotCharacter.stream()
                .filter(e -> e.getAllegiances().equals("Stark"))
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .collect(Collectors.groupingBy(GotCharacter::getBookOfDeath, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> !e.getKey().isEmpty())
                .sorted((e1, e2) -> (e2.getValue().compareTo(e1.getValue())))
                .limit(1)
                .map(e -> "book" + e.getKey() + " death " + e.getValue())
                .collect(Collectors.toList());
    }

    //    In which book die the most amount of characters from the Lannister allegiance?
    public static String bookMostDiedCharactersFromLannister() {
        return listOfGotCharacter.stream()
                .filter(e -> e.getAllegiances().equals("Lannister"))
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .sorted(Comparator.comparing(GotCharacter::getBookOfDeath).reversed())
                .map(gotCharacter -> gotCharacter.getName().toString())
                .collect(Collectors.joining());
    }

    //    How many Starks have died?
    public static Long numberDiedStarks() {
        return listOfGotCharacter.stream()
                .filter(e -> e.getAllegiances().equals("Stark"))
                .map(e -> e.getBookOfDeath())
                .count();
    }

    //    How many Lannisters have died?
    public static Long numberOfDiedLannisters() {
        return listOfGotCharacter.stream()
                .filter(e -> e.getAllegiances().equals("Lannister"))
                .map(e -> e.getBookOfDeath())
                .count();
    }

    //    Is there any character who didn’t die?
    public static List<String> didntDiedCharacters() {
        return listOfGotCharacter.stream()
                .filter(e -> (!e.getBookOfDeath().isEmpty()))
                .map(e -> e.getName())
                .collect(Collectors.toList());
    }

    //    Has any character ever been killed in the same chapter that it got introduced?
    public static List<String> killedCharacterInIntroducedChapter() {
        return listOfGotCharacter.stream()
                .filter(e -> (!e.getBookOfDeath().equals(e.getBookIntroChapter())))
                .map(e -> e.getName())
                .collect(Collectors.toList());
    }
}
