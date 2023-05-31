package day44_PracticeTasks.deviceTask;

public abstract class Device {

    private final String brand, model, size;
    private String color;

    private double price;

    public static boolean hasBattery = true;
    public static boolean hasPowerButton = true;

    public Device(String brand, String model, String size, String color, double price) {
        if (brand.isBlank() || brand.isEmpty()) {
            throw new RuntimeException("Invalid brand: " + brand);
        }
        this.brand = brand;

        if (model.isBlank() || model.isEmpty()) {
            throw new RuntimeException("Invalid model: " + model);
        }
        this.model = model;

        if (size.isBlank() || size.isEmpty()) {
            throw new RuntimeException("Invalid size: " + size);
        }
        this.size = size;

        setColor(color);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }


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

    public abstract void turnOn();

    public abstract void turnOff();

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

/*

1. Create an abstract class named Device:
			Variables:
					brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model color and size can not be null (if obj == null means it's error)
							2. brand, model color and size can not be empty
							3. price can not be set to negative or zero

			Abstract Methods:
				turnOn(), turnOff()

			None Abstract methods:
				toString(): displays brand, model, price

 */