package day35_PracticeTasks.restaurantTask;

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
        restaurant.hireServers(servers);
        restaurant.hireChef(chef1);
        restaurant.hireChef(chefs);

        System.out.println(restaurant);

        System.out.println("------------------------------------------------------");

        for (Server server : restaurant.getServers()) {
            System.out.println(server.getName() + " -> " + server.workStatus() + " : hourlyRate $" + server.getHourlyRate());
        }

        for (Chef chef : restaurant.getChefs()) {
            System.out.println(chef.getName() + " -> " + chef.workStatus() + " : hourlyRate $" + chef.getHourlyRate());
        }

        System.out.println("------------------------------------------------------");

        restaurant.removeChef(152);
        restaurant.removeServer(46);

        System.out.println(restaurant);


    }
}
