package day44_PracticeTasks.carTask;

public abstract class Car {

    private final String brand, model;
    private String color;
    private final int year;
    private double price;


    public Car(String brand, String model, String color, int year, double price) {
        if (brand.isBlank() || brand.isEmpty()) {
            throw new RuntimeException("Invalid brand: " + brand);
        }
        this.brand = brand;
        if (model.isBlank() || model.isEmpty()) {
            throw new RuntimeException("Invalid model: " + model);
        }
        this.model = model;
        setColor(color);
        if (year < 1886) {
            throw new RuntimeException("Invalid Year: " + year);
        }
        this.year = year;
        setPrice(price);
    }

    //--------getters-------------//

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    //-----------setters-----------//


    public void setColor(String color) {
        if (color.isEmpty() || color.isBlank()) {
            throw new RuntimeException("Invalid color: " + color);
        }

        this.color = color;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new RuntimeException("Invalid price: " + price);
        }
        this.price = price;
    }

    //----------methods-------------//

    public abstract void start();

    public void stop() {
        System.out.println("Press the brake");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

/*

Car Task:
	1. Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

					If invalid arguments are given for setting the instances, then manually throw an exception

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()

 */