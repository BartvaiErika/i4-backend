package week9programming.filmsweek9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Scanner;

public class FilmSummarizer {
    public static void main(String[] args) {
        FilmReader reader = new FilmReader();

        List<Film> films = reader.toFilmsRecord();

        System.out.println("Top 3 with highest rating longer than 3 hours, sorted by rating: ");
        System.out.println(top3highestrating(films));

        System.out.println("Top 3 with highest rating longer than 3 hours, sorted by rating: ");
        System.out.println(threeFilmsHighestRatingLonger3Hours(films));

        System.out.println("Top 4 most rated over 7 and budget between 50.000 and 500.000, sorted by budget: ");
        System.out.println(mostRatedOver7Films(films));

        System.out.println("Top 4 most expensive shorter than 90 minutes, sorted by budget: ");
        System.out.println(mostExpensiveFilmsShorter90(films));

        System.out.println("Top 4 most expensive, sorted by budget: ");
        System.out.println(mostExpensiveFilms(films));

        System.out.println("Additional questions: ");
        System.out.println("What are your interests? ");
        Scanner scanner = new Scanner(System.in);
        List<String> interests = new ArrayList<>();
        if (scanner.hasNext()) {
            interests.add(scanner.next());
        }
        System.out.println("Your interests are: "+interests);
    }



    public static List<Film> top3highestrating(List<Film> films) {
        return films.stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public static List<Film> threeFilmsHighestRatingLonger3Hours (List<Film> films) {
        return films.stream()
                .filter(e->e.getRuntime()>180)
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public static List<String> mostExpensiveFilms(List<Film> films) {
        return films.stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .map(e -> e.getTitle())
                .collect(Collectors.toList());
    }

    public static List<Film> mostExpensiveFilmsShorter90 (List<Film> films) {
        return films.stream()
                //.filter(e->e.getRuntime()<90)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .sorted(Comparator.comparing(Film::getRuntime).reversed())
                .limit(4)
                .collect(Collectors.toList());
    }

    public static List<Film> mostRatedOver7Films (List<Film> films) {
        return films.stream()
                .filter(e -> e.getScore() > 7.0)
                .filter(e -> e.getBudget() > 50000)
                //.filter(e -> e.getBudget() < 500000)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());
    }

}
