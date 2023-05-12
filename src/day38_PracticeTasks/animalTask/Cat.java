package day38_PracticeTasks.animalTask;

public class Cat extends Animal {

    public Cat(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating cat food");
    }
}
