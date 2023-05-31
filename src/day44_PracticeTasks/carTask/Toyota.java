package day44_PracticeTasks.carTask;

public final class Toyota extends Car {


    public Toyota(String model, String color, int year, double price) {
        super("Toyota", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Push the start button");
    }

    @Override
    public void stop() {
        super.stop();
    }
}
