package day39_PracticeTasks.statesTask;

public class States {

    private String name, politicalParty, governor, senator;
    private int population;
    private double stateTax;

    public States(String name, String politicalParty, String governor, String senator, int population, double stateTax) {
        setName(name);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null) {
            System.err.println("Invalid name");
            System.exit(1);
        }

        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid name");
            System.exit(1);
        }

        this.name = name;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty == null) {
            System.err.println("Invalid political party");
            System.exit(1);
        }

        if (politicalParty.isEmpty() || politicalParty.isBlank()) {
            System.err.println("Invalid political party");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {

        if (governor == null) {
            System.err.println("Invalid governor");
            System.exit(1);
        }

        if (governor.isEmpty() || governor.isBlank()) {
            System.err.println("Invalid governor");
            System.exit(1);
        }
        governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {

        if (senator == null) {
            System.err.println("Invalid senator");
            System.exit(1);
        }

        if (senator.isEmpty() || senator.isBlank()) {
            System.err.println("Invalid senator");
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population <= 0) {
            System.err.println("Invalid population");
            System.exit(1);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if (stateTax < 0) {
            System.err.println("Invalid tax rate");
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}

/*

1. Create a class named States:
			variables:
				name, abbreviation, politicalParty, Governor, senator, population, stateTax

			Encapsulate all the fields

			Add a constructor that can set all the fields

						Conditions:
							1. name, abbreviation, politicalParty, Governor, and senator can not be null
							2. name, abbreviation, politicalParty, Governor, and senator can not be empty
							3. taxRate can not be negative
							4. Population can not be set to zero or negative

			Methods:
				toString()

 */