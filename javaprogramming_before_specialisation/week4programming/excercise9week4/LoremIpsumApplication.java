package week4programming.excercise9week4;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.File;
import java.io.FileReader;
public class LoremIpsumApplication {

    public static void main(String[] args) {
        week4programming.excercise9week4.FileReader fileReader = new week4programming.excercise9week4.FileReader();
        readDocument(fileReader);
    }

    private static void readDocument(week4programming.excercise9week4.FileReader reader) {
        System.out.println("lorem-ipsum");
        File file = new File("week4programming/excercise9week4/lorem-ipsum");
        String filePath = file.getAbsolutePath();
        List<String> lines = reader.getLines("week4programming/excercise9week4/lorem-ipsum");

        //List<String> lines = reader.getLines("/home/erika/IdeaProjects/java-projects/lorem-ipsum.txt");
        //reader.getLines("C:/IdeaProjects/java-projects/src/week4programming/excercise9week4/lorem-ipsum.txt");

        for (String line : lines) {
            System.out.println(line);
        }
    }

}
