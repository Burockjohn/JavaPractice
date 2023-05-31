package day44_PracticeTasks.carTask;

public final class Audi extends Car implements AutoPark{
    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println("Auto parking for Audi");
    }

    @Override
    public void start() {
        System.out.println("Starting for Audi");
    }

    @Override
    public void stop() {
        super.stop();
    }
}
