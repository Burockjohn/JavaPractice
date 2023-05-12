package day39_PracticeTasks.animalTask;

public class Bear extends WildAnimal {
    public Bear(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void hunt() {
        System.out.println("Bear " + getName() + " hunts fish");
    }
}
