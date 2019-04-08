package week9programming.heroesGuestBoard;
import java.util.Random;
import java.util.stream.Stream;

public class Student {

    private String firstName;
    private String lastName;
    public String studentNumber;

    public Student(String firstName, String lastName, String studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentNumber() {
        Random random = new Random();
        Long number = random.nextLong();
        return lastName.charAt(0)+firstName.charAt(0)+number.toString();
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
    public String getCommaName() {
        return lastName + ", " + firstName;
    }

    public Boolean checkStudentNumber() {
        Character firstLetterStudentNumber = studentNumber.charAt(0);
        Character firstLetterFirstName = firstName.charAt(0);
        Character secondLetterStudentNumber = studentNumber.charAt(1);
        Character firstLetterLastName = lastName.charAt(0);
        if (!firstLetterStudentNumber.equals(firstLetterFirstName)||
                (!secondLetterStudentNumber.equals(firstLetterLastName)))
          return false;
        else {
            for (int i = 2; i < studentNumber.length(); i++) {
               return (!Integer.valueOf(studentNumber.charAt(i)).equals(Integer.TYPE));
            }
        }
        return true;
    }
}