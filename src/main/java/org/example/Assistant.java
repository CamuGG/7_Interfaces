package org.example;

public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson{
    private boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int collegeId, boolean isGoingToBeAPhD) {
        super(name, surname, collegeId);
        this.isGoingToBeAPhD = isGoingToBeAPhD;
    }

    @Override
    public void goToCollege() {
        super.goToCollege();
    }

    @Override
    public String studyAtHome() {
        return "I'm studying in this college!";
    }

    @Override
    public String teachToOtherPeople() {
        return "I'm teaching in this college!";
    }
}
