public class Main {
    public static void main(String[] args) {
	Manager m = new Manager(0, "Bobby", "Murphy", "bobby@snapchat.com", "0563424", 2000, "Pole back");

	Developer kotlinDev = new Developer(1, "d_fistname", "d_lastname", "fistnamelastname@gmail.com", "068524545", 4000, "Kotlin");
	Developer goDev = new Developer(2, "d_fistname", "d_lastname", "fistnamelastname@gmail.com", "068524545", 5000, "Go");

	Team[] teams = new Team[1];
	teams[0] = new Team("Startup",m , 2);
	teams[0].addDeveloper(kotlinDev);
	teams[0].addDeveloper(goDev);

	System.out.println(m.superVisorOf(teams, kotlinDev));
	System.out.println(teams[0].countDevelopers());
	teams[0].deleteDeveloper(goDev);
	System.out.println(teams[0].countDevelopers());
	System.out.println(m.superVisorOf(teams, goDev));
	System.out.println(teams[0].isTeamFull());
    }
}