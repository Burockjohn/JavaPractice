package day44_PracticeTasks.deviceTask;

public class Iphone extends Phone implements Downloadable, AppleApps {
    public Iphone(String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }

    @Override
    public void turnOn() {
        System.out.println("turn on " + getBrand() + getModel());
    }

    @Override
    public void turnOff() {
        System.out.println("turn off " + getBrand() + getModel());
    }

    @Override
    public void downloadApp() {
        System.out.println("download wapp from " + appStoreName);
    }
}
