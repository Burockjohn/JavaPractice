package day33_PracticeTasks;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Daniel", 32, 'M');

        Person person2 = new Person("Kseniia", 28, 'F');

        person2.age = 30;

        System.out.println(person1);
        System.out.println(person2);

        System.out.println("person1.isHuman = " + person1.isHuman);
        System.out.println("person2.numberOfEyes = " + person2.numberOfEyes);


    }
}

