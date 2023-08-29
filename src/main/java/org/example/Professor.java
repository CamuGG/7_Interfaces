package org.example;

public class Professor extends CollegePerson implements TeachingPerson{
    private String teachingSubject;

    public Professor(String name, String surname, int collegeId, String teachingSubject) {
        super(name, surname, collegeId);
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void goToCollege(){
        super.goToCollege();
    }
    @Override
    public String teachToOtherPeople(){
        return "I'm teaching in this college!";
    }
}
