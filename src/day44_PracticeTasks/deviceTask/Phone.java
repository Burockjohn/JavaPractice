package day44_PracticeTasks.deviceTask;

public abstract class Phone extends Device{


    public Phone(String brand, String model, String size, String color, double price) {
        super(brand, model, size, color, price);
    }

    public void call(long number) {
        System.out.println("Calling: " + number );
    }

    public void text(long number) {
        System.out.println("Sending message to: " + number);
    }

}

/*

	2. Create a child abstract class of Device named Phone:

				Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()

 */