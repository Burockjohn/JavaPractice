package day39_PracticeTasks.studentTask;

public class Student extends Person {

    private int studentID;
    private String fieldOfStudy, schoolName;
    private char grade;

    public Student(String name, int age, char gender, int studentID, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender);
        this.studentID = studentID;
        this.fieldOfStudy = fieldOfStudy;
        this.schoolName = schoolName;
        this.grade = grade;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {

        if (fieldOfStudy == null) {
            System.err.println("Invalid field of study");
            System.exit(1);
        }

        if (fieldOfStudy.isEmpty() || fieldOfStudy.isBlank()) {
            System.err.println("Invalid field of study");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {

        if (schoolName == null) {
            System.err.println("Invalid school name");
            System.exit(1);
        }

        if (schoolName.isEmpty() || schoolName.isBlank()) {
            System.err.println("Invalid school name");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {

        if (grade != 'A' && grade != 'B' && grade != 'C' && grade != 'D' && grade != 'F') {
            System.err.println("Invalid grade");
            System.exit(1);
        }
        this.grade = grade;
    }

    //------------------------------------//

    public void study() {
        System.out.println(getName() + " is studying");
    }


    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentID=" + studentID +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade +
                '}';
    }
}

/*

2. Create a subclass of Person named Student:
				Extra variables:
						studentId, fieldOfStudy, grade, schoolName

				Encapsulate all the fields

				Add a constructor that can set all the fields

							Condition:
									1. filedOfStudy and schoolName should not be set to null
									2. filedOfStudy and schoolName should not be empty
									3. grade must be valid (A, B, C, D, F)


				Extra methods:
					study()
					toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included

 */