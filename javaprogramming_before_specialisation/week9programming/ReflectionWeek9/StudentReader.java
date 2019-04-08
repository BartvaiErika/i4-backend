package week9programming.ReflectionWeek9;

import week9programming.filmsweek9.Film;

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

public class StudentReader {
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

    public List <Student> toStudentsRecord() {
        Stream<String> lines = asStream("week9programming/ReflectionWeek9/students-performance.csv");
        return lines.skip(1)
                .map(e->e.split(";"))
                .map(e->new Student(e[0], e[1], Integer.valueOf(e[2]), Integer.valueOf(e[3]), Integer.valueOf(e[4])))
                .collect(Collectors.toList());
    }
}
