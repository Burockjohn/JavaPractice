package day39_PracticeTasks.animalTask;

public class Lion extends WildAnimal{
    public Lion(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void hunt() {
        System.out.println("Lion "+getName()+" hunts buffaloes");
    }
}
