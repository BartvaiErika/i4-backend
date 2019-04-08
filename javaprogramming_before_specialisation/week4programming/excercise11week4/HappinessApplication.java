//package week4programming.excercise11week4;
//import week4programming.excercise9week4.FileReader;
//import java.util.*;
//import java.util.Collections;
//import java.util.function.Function;
//
//public class HappinessApplication {
//    public static void main(String[] args) {
//        FileReader reader = new FileReader();
//        readHappinessRecords(reader);
//    }
//
////    private static void readDocument(week4programming.excercise9week4.FileReader reader) {
////        System.out.println("word-happiness-2017");
////        FileReader fileReader = new FileReader();
////        List<String> lines = reader.getLines("week4programming/excercise11week4/world-happiness-2017.csv");
////        for (String line : lines) {
////            readHappinessRecords(fileReader);
////            //System.out.println(line);
////        }
////    }
//
//    private static HappinessRecord toHappinessRecord(String line) {
//        String[] split = line.split(";");
//        List<String> columns = Arrays.asList(split);
//        String country = columns.get(0);
//        Integer rank = Integer.valueOf(columns.get(1));
//        Double score = Double.valueOf(columns.get(2)) ;
//        return new HappinessRecord(country, rank, score);
//    }
//
//    private static List<HappinessRecord> toHappinessRecords(List<String> lines) {
//        List<HappinessRecord> happinessRecords = new ArrayList<>();
//        for (String line : lines) {
//            HappinessRecord happinessRecord = toHappinessRecord(line);
//            happinessRecords.add(happinessRecord);
//        }
//        happinessRecords.remove(0);
//        return happinessRecords;
//    }
//
//    private static void readHappinessRecords(FileReader reader) {
//        System.out.println("---- Word happiness 2017");
//        List<String> lines = reader.getLines("week4programming/excercise11week4/world-happiness-2017.csv");
//        List<HappinessRecord> happinessRecords = toHappinessRecords(lines);
//        Collections.sort(happinessRecords, Comparator.comparing(HappinessRecord::getRank));
//        for (int i = 0; i < 5; i++) {
//            //System.out.println(toHappinessRecord(lines.get(i)));
//            System.out.println(happinessRecords.toString());
//        }
//    }
//}
