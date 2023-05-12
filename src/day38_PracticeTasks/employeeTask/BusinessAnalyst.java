package day38_PracticeTasks.employeeTask;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, String jobTitle, String companyName, char gender, int age, int id, double salary) {
        super(name, jobTitle, companyName, gender, age, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is analyzing the documents");
    }
}
