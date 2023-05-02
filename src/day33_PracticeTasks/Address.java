package day33_PracticeTasks;

public class Address {

    public String street, city, state;
    public int zipCode, buildingNumber;
    public static String country = "Türkiye";
    public static String planet = "World";

   /* public Address(int buildingNumber, String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.buildingNumber = buildingNumber;
    }

    */

    public void setInfo(int buildingNumber, String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.buildingNumber = buildingNumber;
    }

    public String toString() {
        return buildingNumber + " " + street + "\n" + city + " " + state + ", " + zipCode;
    }
}

/*

5. Address Task:
		1. Create a class named Address:

		    Attributes:
		        instance:  street, city, state, zipCode;
		        static: country, planet

	        Add a constructor that can set All the fields (instances)

		    Actions
		            setInfo: sets all the instances
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012

 */
