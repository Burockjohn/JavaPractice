package day39_PracticeTasks.studentTask;

public class Person {

    private String name;
    private int age;
    private char gender;

    //----------------------------//

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }


    //----------------------------//

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    //----------------------------//

    public void setName(String name) {

        if (name == null) {
            System.err.println("Invalid name");
            System.exit(1);
        }

        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid name");
            System.exit(1);
        }

        for (char ch : name.toCharArray()) {
            if (ch != ' ') {
                if (!Character.isLetterOrDigit(ch)) {
                    System.err.println("Invalid name");
                    System.exit(1);
                }
            }
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.err.println("Invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public void setGender(char gender) {

        gender = ("" + gender).toUpperCase().charAt(0);
        if (gender != 'M' && gender != 'F') {
            System.err.println("Invalid gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    //----------------------------//

    public void eat() {
        System.err.println(name + " is eating");
    }

    public void drink() {
        System.err.println(name + " is drinking");
    }

    public void sleep() {
        System.err.println(name + " is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}


/*

1. Create a class named Person:
			Variables:
				name, age, gender

			Encapsulate all the fields

			Add a constructor that can set all the fields

					Condition:
						1. name should not be set to null
						2. name should not be empty
						3. name should not contain any special character other than space
						4. age should not be set to negative
						5. gender must be valid

			Methods:
				eat()
				drink()
				sleep()
				toString()

 */