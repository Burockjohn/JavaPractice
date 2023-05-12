package day36_PracticeTasks.employeeTask;

public class Developer extends Employee{

    public void coding() {
        System.out.println(name + " is coding");
    }

    public void fixingBugs() {
        System.out.println(name + " is fixing bugs");
    }

}

/*

2.3 Create the subclass of Employee named Developer:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				coding()
				fixingBugs()
				toString()

 */