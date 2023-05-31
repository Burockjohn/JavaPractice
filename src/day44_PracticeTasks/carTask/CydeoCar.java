package day44_PracticeTasks.carTask;

public final class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable{
    public CydeoCar(String model, String color, int year, double price) {
        super("Cydeo", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println("auto parking for Cydeo Car");
    }

    @Override
    public void autoPilot() {
        System.out.println("auto pilot for Cydeo Car");
    }

    @Override
    public void start() {
        System.out.println("starting for Cydeo Car");
    }

    @Override
    public void fly() {
        System.out.println("Cydeo Car can fly");
    }

    @Override
    public void stop() {
        super.stop();
    }
}
