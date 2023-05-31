package day44_PracticeTasks.carTask;

public final class Tesla extends Car implements AutoPark,AutoPilot{
    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println("auto parking for tesla");
    }

    @Override
    public void autoPilot() {
        System.out.println("auto pilot for tesla");
    }

    @Override
    public void start() {
        System.out.println("starting for tesla");
    }

    @Override
    public void stop() {
        super.stop();
    }
}
