package week10programming.movies;

import week10programming.gotCharacters.GotCharacter;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MovieSummarizer {

    private static MovieReader movieReader = new MovieReader();
    private static List<Movie> listOfMovies = movieReader.toMovieRecord();

    public static void main(String[] args) {
        System.out.println("Number of distinct movie genres: " + numberOfMovieGenres());
        System.out.println("Movie genre with the highest revenue: " + genreWithHighestRevenue());
        System.out.println("Two longest movies are " + twoLongestMovies().toString());
    }
//    How many distinct movie genres are there?
//    Which movie genre has the movie with the highest revenue? Display that movie as well.
//    Which movie genres have the two longest movies? Display those movies as well.

    public static Long numberOfMovieGenres() {
        return listOfMovies.stream()
                .distinct().count();
    }

    public static String genreWithHighestRevenue() {
        return listOfMovies.stream()
        .sorted((e1, e2) -> e2.getRevenue().compareTo(e1.getRevenue()))
               // .sorted(Comparator.comparing(Movie::getRevenue).reversed())
                .limit(1)
                .map(movie -> movie.getRevenue().toString())
                .collect(Collectors.joining());

    }

    public static List<Movie> twoLongestMovies() {
        return listOfMovies.stream()
                .sorted((e1, e2) -> e2.getRuntime().compareTo(e1.getRuntime()))
                .sorted(Comparator.comparing(Movie::getRuntime).reversed())
                .limit(2)
                .collect(Collectors.toList());
    }
}
