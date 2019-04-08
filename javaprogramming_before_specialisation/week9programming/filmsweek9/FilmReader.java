package week9programming.filmsweek9;

import week9programming.streamweek9.FileReader;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilmReader {

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

    public List <Film> toFilmsRecord() {
        Stream<String> lines = asStream("week9programming/filmsweek9/films.csv");
        return lines.skip(1)
                .map(e->e.split(";"))
                .map(e->new Film(e[8], Double.valueOf(e[9]), Integer.valueOf(e[10]), Integer.valueOf(e[6]),
                        Integer.valueOf(e[0]), e[5]))
                .collect(Collectors.toList());
    }
}
