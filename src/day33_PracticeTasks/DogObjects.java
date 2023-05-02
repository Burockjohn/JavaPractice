package day33_PracticeTasks;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Pak", "Golden Retriever", "Large", "Golden", 'F', 2);
        System.out.println(dog1);
        System.out.println("dog1.numberOfEyes = " + dog1.numberOfEyes);
        System.out.println("dog1.numberOfLegs = " + dog1.numberOfLegs);
        System.out.println("dog1.numberOfWings = " + dog1.numberOfWings);
        System.out.println("dog1.isFriendly = " + dog1.isFriendly);

    }

}
