import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookReader {

    public List<String> getWords(String path) {
        FileReader fileReader = new FileReader();
        return fileReader.readAsStream(path)
                .map(String::toLowerCase)
                .map(e->e.replaceAll("[,;’s’‘:#.-/*()\\[\\]]", " "))
                .map(e-> e.split(" "))
                .flatMap(Stream::of)
                .filter(e->!e.isEmpty())
                .collect(Collectors.toList());

    }
}
