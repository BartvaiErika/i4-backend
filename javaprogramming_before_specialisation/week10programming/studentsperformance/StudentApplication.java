package week10programming.studentsperformance;

import week9programming.ReflectionWeek9.Student;
import week9programming.ReflectionWeek9.StudentReader;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class StudentApplication {
    private static StudentReader reader = new StudentReader();
    private static List<Student> students = reader.toStudentsRecord();


    public static Map<String, Long> parentLevelEducation() {
        //Map<String, Long> parentLevelEducation =
        return parentialEducationLevels(students).stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    }

    public static List<String> getSortedParentialLevelEducation() {
        return parentLevelEducation().entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " | " + e.getValue()).collect(Collectors.toList());
    }


    public static List<String> parentialEducationLevels(List<Student> students) {
        return students.stream()
                .map(e -> e.getParentalLevelOfEducation())
                .collect(Collectors.toList());
    }

    public static List<String> get3TopScoreWithGender() {
        return students.stream()
                .map(e -> (e.getReadingScore() + e.getMathScore() + e.getWritingScore()) / 3 + " | "
                        + e.getGender())
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
    }

    // How many students have parents with a master’s degree and lower grades than 60 on each topic?
    public static Long numberOfStudentsWithParentsMasterLower60(List<Student> students) {
        return students.stream()
                .filter(e -> e.getParentalLevelOfEducation().equals("master’s degree "))
                .filter(e -> e.getMathScore() < 60)
                .filter(e -> e.getReadingScore() < 60)
                .filter(e -> e.getWritingScore() < 60)
                .count();


    }


    public static Boolean isStudentAnyHighSchoolParentalScore95() {
        return students.stream()
                .filter(e -> e.equals("some high school"))
                .filter(e -> e.getMathScore() >= 95)
                .filter(e -> e.getReadingScore() >= 95)
                .filter(e -> e.getWritingScore() >= 95)
                .count() > 0;
        //also possible instead count()>0: anyMatch(e->e.equals("some high school"));
    }

    public static void main(String[] args) {

        System.out.println("How many times does each parent level of education appear? "
                + parentLevelEducation());
        System.out.println("Which are the different parent level " +
                "of educations sorted from most appearing to least appearing? "
                + getSortedParentialLevelEducation());
        System.out.println("How many students have parents with a master’s degree " +
                "and lower grades than 60 on each topic? "
                + numberOfStudentsWithParentsMasterLower60(students));
        System.out.println("Which genders and average scores do the three " +
                "students with the highest average score have? " + get3TopScoreWithGender());
        System.out.println("Is there any student with a parent education level " +
                "of some high school that has at least 95 in every topic? " + isStudentAnyHighSchoolParentalScore95());

    }


}
