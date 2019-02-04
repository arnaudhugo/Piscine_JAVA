public class Main {
    public static void main(String[] args) {
	App app = new App();
	
	String[] tab = new String[] {"Hello", "world","!", "HE^@^@O", "WOR^@D", "43,44c43,44"};
	app.printArgs(tab);
	app.toUpperCase(tab);
	app.removeChar(tab, 'L');
	app.printArgs(tab);
    }
}