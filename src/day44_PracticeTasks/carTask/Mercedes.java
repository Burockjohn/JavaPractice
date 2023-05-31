package day44_PracticeTasks.carTask;

public final class Mercedes extends Car implements AutoPark {
    public Mercedes(String model, String color, int year, double price) {
        super("Mercedes", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println("auto parking for mercedes");
    }

    @Override
    public void start() {
        System.out.println("starting for mercedes");
    }

    @Override
    public void stop() {
        super.stop();
    }
}
