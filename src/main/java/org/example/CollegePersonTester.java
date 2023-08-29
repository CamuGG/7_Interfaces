package org.example;

public class CollegePersonTester {
    public static void main(String[] args) {
        Student student = new Student("Riccardo", "Arcoria", 123, 5);

        Professor professor = new Professor("Antonello", "Canzano", 456, "Geopolitica");

        Assistant assistant = new Assistant("Simone", "Benedetti", 789, true);

        System.out.println("STUDENTE");
        student.goToCollege();
        System.out.println(student.studyAtHome());

        System.out.println("\nPROFESSORE");
        professor.goToCollege();
        System.out.println(professor.teachToOtherPeople());

        System.out.println("\nASSISTENTE");
        assistant.goToCollege();
        System.out.println(assistant.studyAtHome());
        System.out.println(assistant.teachToOtherPeople());

    }
}
