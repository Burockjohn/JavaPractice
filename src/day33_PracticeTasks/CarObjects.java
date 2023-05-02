package day33_PracticeTasks;

public class CarObjects {


    public static void main(String[] args) {

        Car car1 = new Car("Volkswagen", "Tiguan", "White", 2019, 25000);
        System.out.println(car1);

        System.out.println("car1.numberOfWheels = " + car1.numberOfWheels);
        System.out.println("car1.hasBattery = " + car1.hasBattery);
        System.out.println("car1.hasSeats = " + car1.hasSeats);

    }
}