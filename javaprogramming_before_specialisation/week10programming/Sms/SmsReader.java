package week10programming.Sms;

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

public class SmsReader {
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

    public List<Sms> toSMSRecord() {
        Stream<String> lines = asStream("week10programming/Sms/Sms.csv");
        return lines.skip(1)
                .map(e -> e.split(";"))
                .map(e -> new Sms(e[1], e[2]))
                .collect(Collectors.toList());
    }

}