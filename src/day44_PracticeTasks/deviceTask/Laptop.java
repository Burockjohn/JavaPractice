package day44_PracticeTasks.deviceTask;

public class Laptop extends Computer {
    public Laptop(String brand, String model, String size, String color, double price) {
        super(brand, model, size, color, price);
    }

    @Override
    public void turnOn() {
        System.out.println("turn on " + getBrand() + getModel());
    }

    @Override
    public void turnOff() {
        System.out.println("turn off " + getBrand() + getModel());
    }
}
