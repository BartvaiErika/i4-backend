package week4programming.excercise10week4;

import java.util.ArrayList;
import java.util.List;

import week4programming.excercise7week4ListMap.Topic;
import week4programming.excercise9week4.FileReader;

public class TopicReader {

    private FileReader fileReader;

    public TopicReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public FileReader getFileReader() {
        return fileReader;
    }

    public  void getTopics(FileReader reader) {
        System.out.println("---- TOPICS");
        List<String> lines = reader.getLines("week4programming/excercise10week4/topics");
        List<Topic> topics = toTopics(lines);
        for (Topic topic: topics) {
            System.out.println(topic);
        }
    }

    public static List <Topic> toTopics(List<String> lines) {
        List <Topic> topics = new ArrayList<>();
        for (String line: lines) {
            Topic topic = toTopic(line);
            topics.add(topic);
        }
        return topics;
    }

    private static Topic toTopic(String line) {
        return new Topic(line);
    }

}
