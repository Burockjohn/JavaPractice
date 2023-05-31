package day44_PracticeTasks.deviceTask;

public class Samsung extends Phone implements Downloadable, AndroidApps {
    public Samsung(String brand, String model, String size, String color, double price) {
        super(brand, model, size, color, price);
    }

    @Override
    public void turnOn() {
        System.out.println("turn on samsung " + getBrand() + getModel());
    }

    @Override
    public void turnOff() {
        System.out.println("turn off " + getBrand() + getModel());
    }

    @Override
    public void downloadApp() {
        System.out.println("download maps " + appStoreName);
    }
}
