package day31_PracticeTasks.restaurantTask;

public class LocalRestaurant {
    public static void main(String[] args) {

        Server server1 = new Server("Ahmet", 23, 40, true);
        Server server2 = new Server("Mehmet", 46, 50, true);
        Server server3 = new Server("Ali", 16, 35, true);
        Server server4 = new Server("Veli", 32, 25, false);

        Server servers[] = {server2, server3, server4};

        Chef chef1 = new Chef("Recep", 116, 60, true);
        Chef chef2 = new Chef("Mustafa", 152, 40, false);
        Chef chef3 = new Chef("Nusret", 178, 35, false);

        Chef chefs[] = {chef2, chef3};

        Restaurant restaurant = new Restaurant("Burak", "Ankara", 3);
        restaurant.hireServer(server1);
        restaurant.hireServer(servers);
        restaurant.hireChef(chef1);
        restaurant.hireChef(chefs);

        System.out.println(restaurant);

        System.out.println("------------------------------------------------------");

        for (Server server : restaurant.servers) {
            System.out.println(server.name + " -> " + server.workStatus() + " : hourlyRate $" + server.hourlyRate);
        }

        for (Chef chef : restaurant.chefs) {
            System.out.println(chef.name + " -> " + chef.workStatus() + " : hourlyRate $" + chef.hourlyRate);
        }

        System.out.println("------------------------------------------------------");

        restaurant.terminateChef(178);
        restaurant.terminateServer(46);

        System.out.println(restaurant);

    }
}


/*

6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information

 */