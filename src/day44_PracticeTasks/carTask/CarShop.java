package day44_PracticeTasks.carTask;

public class CarShop {

    public static void main(String[] args) {

        //    Car car1 = new Car("Cydeo", "25", "Blue", 2022, 100000);
        // we can not create object from Abstract class, because abstract class is not concrete


        Honda honda = new Honda("Accord", "Black", 2019, 30000);

        Audi audi = new Audi("Q7", "Blue", 2020, 45000);

        Tesla tesla = new Tesla("Model3", "White", 2021, 60000);

        CydeoCar cydeoCar = new CydeoCar("Java", "Orange", 2023, 130_000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
        System.out.println(cydeoCar);

        System.out.println("------------------------------------");

        honda.setColor("Red");
        audi.setColor("Pink");
        tesla.setColor("Green");
        cydeoCar.setColor("Navy Blue");

        honda.setPrice(25000);
        audi.setPrice(40000);
        tesla.setPrice(55000);
        cydeoCar.setPrice(120_000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
        System.out.println(cydeoCar);

        honda.start();
        audi.start();
        tesla.start();
        cydeoCar.fly();

    }
}
