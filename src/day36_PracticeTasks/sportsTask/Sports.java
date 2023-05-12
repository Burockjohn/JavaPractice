package day36_PracticeTasks.sportsTask;

public class Sports {

    private String name, pitch;
    private int numberOfPlayers, numberOfRef;

    public void setInfo(String pitch, int numberOfPlayers, int numberOfRef) {
        name = getClass().getSimpleName();
        setPitch(pitch);
        setNumberOfPlayers(numberOfPlayers);
        setNumberOfRef(numberOfRef);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPitch() {
        return pitch;
    }

    public void setPitch(String pitch) {
        this.pitch = pitch;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfRef() {
        return numberOfRef;
    }

    public void setNumberOfRef(int numberOfRef) {
        this.numberOfRef = numberOfRef;
    }

    public void play() {
        System.out.println("Players are playing " + name);
    }

    public String toString() {
        return "Sports{" +
                "name='" + name + '\'' +
                ", pitch='" + pitch + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfRef=" + numberOfRef +
                '}';
    }
}

/*

Sports Task:
	1. Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfReferre, rules



			methods:
				setInfo()
				play()
				toString()

		2. create the following sub classes of Sport:
				1. Basketball
				2. Baseball
				3. Football
				4. AmericanFootball

			Add any missing variables or methods

			Note: you can search them on google

 */