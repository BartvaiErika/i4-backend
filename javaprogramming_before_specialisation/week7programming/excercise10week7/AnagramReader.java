package week7programming.excercise10week7;

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

public class AnagramReader {

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

    public List <String> toAnagramsRecord() {
        Stream<String> words = asStream("week7programming/excercise10week7/anagram-words.txt");
        return words
                .map(e->e.replaceAll("      ", " "))
                .map(e->e.replaceAll("     ", " "))
                .map(e->e.replaceAll("    ", " "))
                .map(e->e.replaceAll("   ", " "))
                .map(e->e.replaceAll(" ", ""))
                .map(e->e.split(" "))
                .flatMap(Stream::of)
                .filter(word -> !word.isEmpty())
                .collect(Collectors.toList());
    }
}
