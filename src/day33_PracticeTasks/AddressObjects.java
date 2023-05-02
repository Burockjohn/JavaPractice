package day33_PracticeTasks;

public class AddressObjects {

    public static void main(String[] args) {

        Address address1 = new Address();
        address1.setInfo(8, "7007", "Balıkesir", "Mamrmara", 10100);
        System.out.println(address1);
        System.out.println("address1.country = " + address1.country);
        System.out.println("address1.planet = " + address1.planet);

    }
}
