package org.example;

public class Student extends CollegePerson implements LearningPerson{
    private  int accademicYear;

    public Student(String name, String surname, int collegeId, int accademicYear) {
        super(name, surname, collegeId);
        this.accademicYear = accademicYear;
    }

    @Override
    public void goToCollege() {
        super.goToCollege();
    }

    @Override
    public String studyAtHome() {
        return "I'm studying in this college!";
    }
}
