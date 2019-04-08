package week10programming.gotCharacters;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharacterReader {
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

    public List <GotCharacter> toGotCharacterRecord() {
        Stream<String> lines = asStream("week10programming/gotCharacters/got-characters.csv");
        return lines.skip(1)
                .map(e->e.split(";"))
                .map(e->new GotCharacter(e[0], e[1], e[2], e[3], e[4], e[5], Integer.valueOf(e[6]),
                        Integer.valueOf(e[7]),Integer.valueOf(e[8]),Integer.valueOf(e[9]),Integer.valueOf(e[10]),
                        Integer.valueOf(e[11]),Integer.valueOf(e[12])))
                .collect(Collectors.toList());
    }

}
