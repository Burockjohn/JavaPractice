package day33_PracticeTasks;

public class CydeoStudent {

    public String name;
    public char gender, grade;
    public int id, batchNumber, groupNumber;
    public static String schoolName = "Cydeo School";
    public static String programmingLanguage = "Java";

    public CydeoStudent(String name, char gender, char grade, int id, int batchNumber, int groupNumber) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study() {
        System.out.println(name + " is studying");
    }

    public void attendClass() {
        System.out.println(name + " just attended");
    }

    public void printSchoolName() {
        System.out.println(schoolName);
    }

    public void printProgLanguage() {
        System.out.println(programmingLanguage);
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}

/*

1. CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()

 */
