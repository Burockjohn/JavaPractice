package day38_PracticeTasks.employeeTask;

public class Employee {

    private String name, jobTitle, companyName;
    private char gender;
    private int age, id;
    private double salary;


    public Employee(String name, String jobTitle, String companyName, char gender, int age, int id, double salary) {
        setName(name);
        setJobTitle(jobTitle);
        setCompanyName(companyName);
        setGender(gender);
        setAge(age);
        setId(id);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    public void work() {
        System.out.println("");


    }
}

/*

Employee Task:
	1. Create a class named Employee
			Variables:
				name, age, gender, id, jobTitle, salaryName, companyName

			Add a constructor to set all the fields

			Methods:
				work()
				toString()


	2. Create ethe following subclasses and override the work method in each subclass:

			1. Tester
			2. Developer
			3. ProductOwner
			4. BusinessAnalyst
			5. ScrumMaster
			6. Teacher
			7. Driver
			9. Pilot

		if any adidtional field or methods needed, please add them

 */