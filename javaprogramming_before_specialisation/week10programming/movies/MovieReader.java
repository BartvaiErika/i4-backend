package week10programming.movies;

import week10programming.Sms.Sms;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieReader {

    public List<String> asList(String filePath) {
        try {
            Path path = getPath(filePath);
            return Files.readAllLines(path);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public Stream<String> asStream(String filePath) {
        try {
            Path path = getPath(filePath);
            return Files.lines(path);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
            return Stream.empty();
        }
    }

    private Path getPath(String filePath) throws URISyntaxException {
        URI uri = ClassLoader.getSystemResource(filePath).toURI();
        return Paths.get(uri);
    }

    public List<Movie> toMovieRecord() {
        Stream<String> lines = asStream("week10programming/movies/movies.csv");
        return lines.skip(1)
                .map(e -> e.split(";"))
                .map(e -> new Movie(e[1], e[2],
                        Long.valueOf(e[5]),
                        Integer.valueOf(e[6]), e[8]))
                .collect(Collectors.toList());
    }



//    2. genres: String
//3. id: String
//6. revenue: Long
//7. runtime: 162; Integer
//9. title: Avatar; String
}
