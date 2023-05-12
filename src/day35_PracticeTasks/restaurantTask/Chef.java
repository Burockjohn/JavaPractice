package day35_PracticeTasks.restaurantTask;

public class Chef {

    private String name;
    private int employeeID;
    private double hourlyRate;
    private boolean isFullTime;


    public Chef(String name, int employeeID, double hourlyRate, boolean isFullTime) {
        setName(name);
        setEmployeeID(employeeID);
        setHourlyRate(hourlyRate);
        setFullTime(isFullTime);
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeID(int employeeID) {
        if (employeeID <= 0) {
            System.out.println("Invalid employee ID");
            return;
        }
        this.employeeID = employeeID;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate <= 0) {
            System.out.println("Invalid employee ID");
            return;
        }
        this.hourlyRate = hourlyRate;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public String workStatus() {
        return (isFullTime) ? "full-time" : "part-time";

    }

    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", workStatus=" + workStatus() +
                '}';
    }
}

/*

6.2 Create a class called Chef

		            Attributes:
		                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

			   Add A constructor that can set all the fields

		            Actions: (all void methods)
		                makeOrder(): chef's name + "is making an order"
		                washDishes(): chef's name + "is washing the dishes"
		                toString(): Returns (String) all the information of a Chef
		                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"

 */
