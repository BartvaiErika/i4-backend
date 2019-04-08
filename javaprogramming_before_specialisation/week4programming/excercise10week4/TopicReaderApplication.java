package week4programming.excercise10week4;

import java.io.File;
import java.util.*;

import week4programming.excercise9week4.FileReader;

public class TopicReaderApplication {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        TopicReader topicReader = new TopicReader(fileReader);
        topicReader.getTopics(fileReader);

        readDocument(fileReader);


    }

    private static void readDocument(week4programming.excercise9week4.FileReader reader) {
        File file = new File("week4programming/excercise10week4/topics");
        String filePath = file.getAbsolutePath();
        System.out.println(filePath);
        List<String> lines = reader.getLines("week4programming/excercise10week4/topics");
        for (String line : lines) {
            System.out.println(line);
        }
    }

}
