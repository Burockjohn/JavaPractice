package day44_PracticeTasks.carTask;

public final class Nio extends Car implements AutoPilot, AutoPark{
    public Nio(String model, String color, int year, double price) {
        super("Nio", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println("auto parking for nio");
    }

    @Override
    public void autoPilot() {
        System.out.println("auto pilot for nio");
    }

    @Override
    public void start() {
        System.out.println("starting for nio");
    }

    @Override
    public void stop() {
        super.stop();
    }
}
