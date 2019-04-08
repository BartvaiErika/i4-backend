package week7programming.excercise9week7;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class BookToList {

    //List<Book> books

    private static void readBook(FileReader reader) {
        System.out.println("Books: ");
        File file = new File("week7programming/excercise9week7/Book/lorem-ipsum");
        String filePath = file.getAbsolutePath();
        List<String> lines = reader.getLines("week4programming/excercise9week4/lorem-ipsum");

        //List<String> lines = reader.getLines("/home/erika/IdeaProjects/java-projects/lorem-ipsum.txt");
        //reader.getLines("C:/IdeaProjects/java-projects/src/week4programming/excercise9week4/lorem-ipsum.txt");

        for (String line : lines) {
            System.out.println(line);
        }
    }

}
