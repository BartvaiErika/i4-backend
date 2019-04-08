package week9programming.ReflectionWeek9;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentSummarizer {

    public static void main(String[] args) {

        StudentReader reader = new StudentReader();

        List<Student> students = reader.toStudentsRecord();

        System.out.println("Total number of student performance entries: " + students.size());

        System.out.println("Number of female students: " + numberOfFemaleStudents(students));

        System.out.println("Number of male students: " + numberOfMaletudents(students));

        System.out.println("Parental education levels sorted alphabetically: " + parentialEducationLevels(students));

        System.out.println("Number of students with scores higher or equal than 90: " + numberOfStudentsWithScoresHigher90(students));

        System.out.println("Number of students with scores equal to 100:" + numberOfStudentsWithScoresEqual100(students));

        System.out.println("Genders of these students are: " + gendersOfStudents(students));

    }

//    public static Long totalNumberOfStudentPerformanceEntries(List<Student> students) {
//        return students.stream()
//                .filter(e -> e.getGender())
//                .count();
//    }

    public static Long numberOfFemaleStudents(List<Student> students) {
        return students.stream()
                .filter(e -> e.getGender().equals("female"))
                .count();
    }

    public static Long numberOfMaletudents(List<Student> students) {
        return students.stream()
                .filter(e -> e.getGender().equals("male"))
                .count();
    }

    public static List<String> parentialEducationLevels(List<Student> students) {
        return students.stream()
                .map(e -> e.getParentalLevelOfEducation())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static Long numberOfStudentsWithScoresHigher90(List<Student> students) {
        return students.stream()
                .filter(e->e.mathScore>=90)
                .filter(e->e.readingScore>=90)
                .filter(e->e.writingScore>=90)
                .count();
    }

    public static Long numberOfStudentsWithScoresEqual100(List<Student> students) {
        return students.stream()
                .filter(e->e.mathScore.equals(100))
                .filter(e->e.readingScore.equals(100))
                .filter(e->e.writingScore.equals(100))
                .count();
    }

    public static List<String> gendersOfStudents(List<Student> students) {
        return students.stream()
                .map(e -> e.getGender())
                .collect(Collectors.toList());
    }

}
