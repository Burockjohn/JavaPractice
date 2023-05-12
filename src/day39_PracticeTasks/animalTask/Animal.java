package day39_PracticeTasks.animalTask;

public class Animal {

    private String name, breed, size, color;
    private char gender;
    private int age;

    //------------------------------------//

    public Animal(String name, String breed, String size, String color, char gender, int age) {
        setName(name);
        setBreed(breed);
        setSize(size);
        setColor(color);
        setGender(gender);
        setAge(age);
    }


    //------------------------------------//


    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    //----------------------------------------------//


    public void setName(String name) {

        if (name == null) {
            System.err.println("Invalid name");
            System.exit(1);
        }

        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid name");
            System.exit(1);
        }

        this.name = name;
    }

    public void setBreed(String breed) {

        if (breed == null) {
            System.err.println("Invalid breed");
            System.exit(1);
        }

        if (breed.isEmpty() || breed.isBlank()) {
            System.err.println("Invalid breed");
            System.exit(1);
        }

        this.breed = breed;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        if (color == null) {
            System.err.println("Invalid color");
            System.exit(1);
        }

        if (color.isEmpty() || color.isBlank()) {
            System.err.println("Invalid color");
            System.exit(1);
        }

        this.color = color;
    }

    public void setGender(char gender) {
        gender = ("" + gender).toUpperCase().charAt(0);
        if (gender != 'M' && gender != 'F') {
            System.err.println("Invalid gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.err.println("Invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    //----------------------------------------------//

    public void eat() {
        System.out.println("");
    }

    public void drink() {
        System.out.println(name + " drinks water");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void move() {
        System.out.println(name + " is moving");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}

/*

1. Create a class named Animal:
			variables:
				name, breed, gender, age, size, color

			Encapsulate all the fields

			Add a constructor to set all the fields

					Conditions:
						1. name, breed and color can not be null (if obj == null means it's error)
						2. name, breed and color can not be empty or can not be blank
						3. gender should only be set to either 'M' or 'F'
						4. age can not be set to negative

			Methods:
				eat()
				drink()
				sleep()
				move()
				toString()


 */