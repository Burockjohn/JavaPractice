package day36_PracticeTasks.employeeTask;

public class Employee {

    public String name, jobTitle;
    public char gender;
    public int age, id;
    public double salary;

    public void setInfo(String name, char gender, int age, int id, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}

/*

2. Employee Task:
	2.1 Create a class named Employee:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				toString()














 */