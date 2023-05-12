package day39_PracticeTasks.studentTask;

public class UndergraduateStudent extends Student {
    public UndergraduateStudent(String name, int age, char gender, int studentID, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentID, fieldOfStudy, schoolName, grade);
    }

    @Override
    public void study() {
        System.out.println("They are studying very hard");
    }
}
