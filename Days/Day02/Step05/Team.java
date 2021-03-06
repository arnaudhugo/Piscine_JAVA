public class Team {
    private String name;
    private Manager manager;
    private int numberOfDevelopers;
    private Developer[] tab;

    public Team() {
    }

    public Team(String name, Manager manager, int numberOfDevelopers) {
	this.name = name;
	this.manager = manager;
	this.numberOfDevelopers = numberOfDevelopers;
	tab = new Developer [numberOfDevelopers];
    }

    public String getName() {
	return(this.name);
    }

    public void setName(String name) {
	this.name = name;
    }
    
    public Developer[] getTab() {
	return(this.tab);
    }

    public Manager getManager() {
	return(this.manager);
    }

    public void setManager(Manager manager) {
	this.manager = manager;
    }

    public boolean addDeveloper(Developer d) {
	for (int i = 0; i < tab.length; i++) {
	    if (tab[i] == null) {
		this.tab[i] = d;
		return(true);
	    }
	}
	return(false);
    }

    public boolean deleteDeveloper(Developer d) {
	for (int i = 0; i < tab.length; i++) {
            if (tab[i] == d) {
                this.tab[i] = null;
                return(true);
            }
        }
        return(false);
    }

    public int countDevelopers() {
	int count = 0;

	for (int i = 0; i < tab.length; i++) {
            if (tab[i] != null)
                count++;
        }
        return(count);
    }

    public boolean isTeamFull() {
	if (countDevelopers() == numberOfDevelopers)
	    return(true);
	else
	    return(false);
    }
}