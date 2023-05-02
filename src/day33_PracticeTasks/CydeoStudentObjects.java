package day33_PracticeTasks;

public class CydeoStudentObjects {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Burak", 'M', 'A', 4314, 11, 5);
        System.out.println(student1);
        student1.printSchoolName();
        student1.printProgLanguage();

        System.out.println("-------------------------------------------------------");

        CydeoStudent student2= new CydeoStudent("Yunus", 'M', 'A', 4356, 11, 5);
        System.out.println(student2);
        student2.printSchoolName();
        student2.printProgLanguage();

    }
}
