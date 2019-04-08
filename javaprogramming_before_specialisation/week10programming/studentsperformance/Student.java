package week10programming.studentsperformance;

public class Student {

    protected String gender;
    protected String parentalLevelOfEducation;
    protected Integer mathScore;
    protected Integer readingScore;
    protected Integer writingScore;

    public Student(String gender, String parentalLevelOfEducation, Integer mathScore, Integer readingScore, Integer writingScore) {
        this.gender = gender;
        this.parentalLevelOfEducation = parentalLevelOfEducation;
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        this.writingScore = writingScore;
    }

    public String getGender() {
        return gender;
    }

    public String getParentalLevelOfEducation() {
        return parentalLevelOfEducation;
    }

    public Integer getMathScore() {
        return mathScore;
    }

    public Integer getReadingScore() {
        return readingScore;
    }

    public Integer getWritingScore() {
        return writingScore;
    }

}
