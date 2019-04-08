package week12programming;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

//This problem was asked by Airbnb.
//
//        We're given a hashmap associating each courseId key with a list of courseIds values,
// which represents that the prerequisites of courseId are courseIds.
//        Return a sorted ordering of courses such that we can finish all courses.
//
//        Return null if there is no such ordering.
//
//        For example, given {'CSC300': ['CSC100', 'CSC200'], 'CSC200': ['CSC100'], 'CSC100': []},
// should return ['CSC100', 'CSC200', 'CSCS300'].
public class Airbnb {

   protected static Map<String,String[]> courseID() {
       Map<String,String[]> courseIds= new HashMap<>();
       courseIds.put("CSC300", new String[]{"CSC100", "CSC200"});
       courseIds.put("CSC200", new String[]{"CSC100"});
       courseIds.put("CSC100", new String[]{});
       return courseIds;
   }

    public static void main(String[] args) {
        System.out.println(sortCourseIDs(courseID()));

    }

    public static List<String> sortCourseIDs (Map <String, String[]> courseId) {
        return courseId.entrySet().stream()
                .map(e->e.getKey())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

}
