package week10programming.Pokemon;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PokemonApplication {
    public static PokemonReader pokemonReader = new PokemonReader();
    public static List<Pokemon> pokemons = pokemonReader.toPokemonsRecord();

    public static void main(String[] args) {

        System.out.println("List of pokemons: " + ListOfPokemons());
        System.out.println("Set of pokemons: " + setOfPokemons());
        System.out.println("More attack then defense: " + attackMoreThanDefense());
//        System.out.println("Number of Pokemons in List: " + numberOfPokemon());
//        System.out.println("Number of pokemons in set: " + listOfPokemons());
//        System.out.println("Sorted list of pokemons: "+sortedListOfPokemon());
//        System.out.println("Sorted set of pokemons: "+//sortedSetPokemon());
    }

    public static List<Pokemon> ListOfPokemons() {
        return pokemons;
    }

    public static Set<Pokemon> setOfPokemons() {
        return pokemons.stream()
                .collect(Collectors.toSet());
    }

    public Integer numberOfPokemons() {
        return pokemons.size();
    }

    public Map<String, List<Pokemon>> pokemonsGroupedByType1() {
        return pokemons.stream()
                .collect(Collectors.groupingBy(pokemon -> pokemon.getType1(), Collectors.toList()));
    }

    public Map<String, List<Pokemon>> pokemonsGroupedByType2() {
        return pokemons.stream()
                .collect(Collectors.groupingBy(pokemon -> pokemon.getType2(), Collectors.toList()));
    }

    public Long numberOfPokemonsWithoutType2() {
        return pokemons.stream()
                .filter(e -> e.getType2().equalsIgnoreCase(""))
                .count();
    }

    public List<Pokemon> getFastestPokemons() {
        return pokemons.stream()
                .filter(e -> e.getSpeed() == 100)
                .sorted((e1, e2) -> e2.getSpeed().compareTo(e1.getSpeed()))
                .limit(1)
                .collect(Collectors.toList());
    }

    public Map<Integer, List<Pokemon>> first5MaxTotal() {
        return pokemons.stream()
                .sorted(Comparator.comparing(Pokemon::getTotal).reversed())
                .limit(5)
                .collect(Collectors.groupingBy(e -> e.getTotal(), Collectors.toList()));
    }

    public List<Pokemon> legendaryPokemons() {
        return pokemons.stream()
                .filter(e -> Boolean.valueOf(e.getLegendary()).equals(true))
                .sorted(Comparator.comparing(Pokemon::getSpeed))
                .collect(Collectors.toList());
    }


    public static Map<String, List<Integer>> attackMoreThanDefense() {
        return pokemons.stream()
                .filter(e -> e.getAttack() > e.getDefense())
                .collect(Collectors.groupingBy(Pokemon::getName,
                        Collectors.mapping(Pokemon::getAttack, Collectors.toList())));
    }

    public static Map<String, List<Integer>> defensePokemons() {
        return pokemons.stream()
                .filter(e -> e.getAttack() < e.getDefense())
                .collect(Collectors.groupingBy(Pokemon::getName,
                        Collectors.mapping(Pokemon::getDefense, Collectors.toList())));
    }

    public static Boolean checkTotalOfPokemons() {
        return pokemons.stream()
                .allMatch(pokemons -> pokemons.getAttack() + pokemons.getDefense() + pokemons.getSpeed()
                        + pokemons.getSpAtk() + pokemons.getSpDef() != (pokemons.getTotal()));
    }

    public static List<Pokemon> alphabeticallySortedNamesOfPokemons() {
        return pokemons.stream()
                .sorted(Comparator.comparing(pokemon -> String.valueOf(alphabeticallySortedNamesOfPokemons())))
                .collect(Collectors.toList());
    }

    public static Integer highestSpeed() {
        return pokemons.stream().mapToInt(e -> e.getSpeed()).max().getAsInt();
    }

    public static List<Pokemon> speedestPokemon() {
        return pokemons.stream()
                .filter(e -> e.getSpeed().equals(highestSpeed())).collect(Collectors.toList());
    }

    public static void averageSpeed() {
         pokemons.stream()
                .mapToInt(e -> e.getSpeed())
                .average()
                .ifPresent(average -> System.out.println("Average speed of pokemons: "+ average));
    }
}


