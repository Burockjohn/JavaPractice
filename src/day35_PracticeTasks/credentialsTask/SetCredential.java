package day35_PracticeTasks.credentialsTask;

public class SetCredential {

    public static void main(String[] args) {

        Credentials user1 = new Credentials("burockjohn","escobar3");
        System.out.println(user1);

        user1.setPassword("Escobar*3");
        System.out.println(user1.getPassword());

    }
}
