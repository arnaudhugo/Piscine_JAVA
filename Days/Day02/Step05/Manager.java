public class Manager extends Employee {
    String service;

    public Manager() {
    }

    public Manager(int id, String firstname, String lastname, String mail, String phone, double salary, String service) {
	super(id, firstname, lastname, mail, phone, salary);
	this.service = service;
    }

    public double getSalary() {
	salary = salary * 1.35;
	return(salary);
    }

    public boolean superVisorOf(Team[] t, Developer d) {
	for (int i = 0; i < t.length; i++) {
	    if (t[i].getManager() == this) {
		for (int j = 0; j < t[i].getTab().length; j++) {
		    if (t[i].getTab()[j] == d)
			return(true);
		}
	    }
	}
	return(false);
    }
}