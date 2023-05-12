package day36_PracticeTasks.sportsTask;

public class Football extends Sports {

    private String goalie;


    public void setInfo(String pitch, int numberOfPlayers, int numberOfRef, String goalie) {
        setInfo(pitch, numberOfPlayers, numberOfRef);
        setGoalie(goalie);
    }

    public String getGoalie() {
        return goalie;
    }

    public void setGoalie(String goal) {
        this.goalie = goal;
    }

    public void save() {
        System.out.println(getGoalie() + " saved the shoot");
    }

    public String toString() {
        return "Football{" +
                ", pitch='" + getPitch() + '\'' +
                ", numberOfPlayers=" + getNumberOfPlayers() +
                ", numberOfRef=" + getNumberOfRef() +
                "goalie='" + goalie + '\'' +
                '}';
    }
}
