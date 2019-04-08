package week12programming.Backery;

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

public class PaymentReader {

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

    protected List<Payment> getListOfPayments(String filePath) {
        FileReader reader = new FileReader();
        return reader.asStream(filePath)
                .map(column -> column.split(" "))
                .map(columns -> new Payment(Integer.valueOf(columns[1]), Double.valueOf(columns[2]),
                        Double.valueOf(columns[5])))
                .collect(Collectors.toList());

//        return reader.asStream(filePath)
//                .map(column -> column.split(" "))
//                .map(columns -> new Payment(Integer.valueOf(columns[1]), Double.valueOf(columns[2]),
//                        Double.valueOf(columns[5])))
//                .collect(Collectors.toList());

    }

}
