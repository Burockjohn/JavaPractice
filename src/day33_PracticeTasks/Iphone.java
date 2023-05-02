package day33_PracticeTasks;

public class Iphone {

    public static String brand = "Apple";

    public String model;
    public double price;

    public static String OS = "iOS";

    public String color;

    public String size;

    public static String madeIn = "China";

    public Iphone(String model, double price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public void faceTime(long phoneNumber) {
        System.out.println("calling " + phoneNumber);
    }

    public void faceTime(String email) {
        System.out.println("sending mail to " + email);
    }

    public void call(long phoneNumber) {
        System.out.println("calling " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println("sending message to " + phoneNumber);
    }



    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

/*

4. IPhone Task:
		1. Create a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

 */