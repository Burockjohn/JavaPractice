package day36_PracticeTasks.employeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {


        Tester tester = new Tester();
        tester.setInfo("James", 'M', 35, 11, "QA", 100000);

        Developer developer = new Developer();
        developer.setInfo("Kathy", 'F', 32, 19, "Java Developer", 120000);

        Teacher teacher = new Teacher();
        teacher.setInfo("Smith", 'M', 45, 22, "Math Teacher", 80000);

        Driver driver = new Driver();
        driver.setInfo("Oscar", 'M', 39, 25, "Truck Driver", 100000);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

    }
}

/*

2.7 Create a class named Employee Objects and test of the subclass' objects

 */