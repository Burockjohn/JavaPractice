package day39_PracticeTasks.animalTask;

public class WildAnimal extends Animal{

    public static boolean isWild = true, isFriendly = false, isPlayable = false;

    public WildAnimal(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void hunt(){
        System.out.println(getName()+" is hunting");
    }

}


/*
Create a subclass of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()
 */
