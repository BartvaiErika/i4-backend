package week4programming.sample;

import java.util.*;

public class FilesApplication {

    public static void main(String[] args) {
        FileReader reader = new FileReader();
 //       readDocument(reader);
 //       readNames(reader);
        readParticipants(reader);
    }

//    private static void readDocument(FileReader reader) {
//        System.out.println("---- DOCUMENT");
//        List<String> lines = reader.getLines("week4programming/sample/document");
//        for (String line : lines) {
//            System.out.println(line);
//        }
//    }

//    private static void readNames(FileReader reader) {
//        System.out.println("---- NAMES");
//        List<String> lines = reader.getLines("week4programming/sample/");
//        for (String line : lines) {
//            String name = line.toUpperCase();
//            System.out.println(name);
//        }
//    }

    private static void readParticipants(FileReader reader) {
        System.out.println("---- PARTICIPANTS");
        List<String> lines = reader.getLines("week4programming/sample/participants.csv");
        List<Participant> participants = toParticipants(lines);
        Collections.sort(participants, Comparator.comparing(Participant::getName));
        for (Participant participant : participants) {
            System.out.println(participant);
        }
    }

    private static List<Participant> toParticipants(List<String> lines) {
        List<Participant> participants = new ArrayList<>();
        for (String line : lines) {
            Participant participant = toParticipant(line);
            participants.add(participant);
        }
        return participants;
    }

    private static Participant toParticipant(String line) {
        String[] split = line.split(";");
        List<String> columns = Arrays.asList(split);
        String name = columns.get(0);
        String group = columns.get(1).trim();
        return new Participant(name, group);
    }

}