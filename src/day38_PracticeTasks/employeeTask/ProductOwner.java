package day38_PracticeTasks.employeeTask;

public class ProductOwner extends Employee {
    public ProductOwner(String name, String jobTitle, String companyName, char gender, int age, int id, double salary) {
        super(name, jobTitle, companyName, gender, age, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+ " " + getName() + " is collecting requirements");
    }
}
