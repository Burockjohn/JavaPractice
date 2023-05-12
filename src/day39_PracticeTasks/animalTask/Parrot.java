package day39_PracticeTasks.animalTask;

public class Parrot extends FriendlyAnimal {
    public Parrot(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void fly() {
        System.out.println(getName() + " is flying");
    }

    public void sing() {
        System.out.println(getName() + " is singing");
    }

}
