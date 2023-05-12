package day39_PracticeTasks.animalTask;

public class FriendlyAnimal extends Animal {

    public static boolean isWild = false, isFriendly = true, isPlayable = true;

    public FriendlyAnimal(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void pet() {
        System.out.println(getName() + " likes being petted");
    }

    public void playing() {
        System.out.println(getName() + " is playing");
    }
}

/*

2. Create a subclass of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()


 */