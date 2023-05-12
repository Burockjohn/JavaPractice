package day35_PracticeTasks.restaurantTask;

public class Server {

    private String name;
    private int employeeID;
    private double hourlyRate;
    private boolean isFullTime;


    public Server(String name, int employeeID, double hourlyRate, boolean isFullTime) {
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
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", workStatus=" + workStatus() +
                '}';
    }

}
