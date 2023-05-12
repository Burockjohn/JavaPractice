package day35_PracticeTasks.restaurantTask;

import day35_PracticeTasks.scrumTeamTask.Developer;
import day35_PracticeTasks.scrumTeamTask.Tester;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    private String owner, location;
    private int numberOfStars;

    private ArrayList<Chef> chefs = new ArrayList<>();
    private ArrayList<Server> servers = new ArrayList<>();


    public Restaurant(String owner, String location, int numberOfStars) {
        setOwner(owner);
        setLocation(location);
        setNumberOfStars(numberOfStars);
    }

    public String getOwner() {
        return owner;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public ArrayList<Chef> getChefs() {
        return chefs;
    }

    public ArrayList<Server> getServers() {
        return servers;
    }

    //-------------------------------------------------\\


    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumberOfStars(int numberOfStars) {
        if (numberOfStars > 5 || numberOfStars <= 0) {
            System.err.println("Invalid number of stars");
            return;
        }
        this.numberOfStars = numberOfStars;
    }

    public void hireChef(Chef chef) {
        chefs.add(chef);
    }

    public void hireChef(Chef[] chefs) {
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void removeChef(int id) {
        chefs.removeIf(p -> p.getEmployeeID() == id);
    }

    public void hireServer(Server server) {
        servers.add(server);
    }

    public void hireServers(Server[] servers) {
        this.servers.addAll(Arrays.asList(servers));
    }

    public void removeServer(int id) {
        servers.removeIf(p -> p.getEmployeeID() == id);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", total number of chefs =" + chefs.size() +
                ", total number of servers =" + servers.size() +
                '}';
    }
}
