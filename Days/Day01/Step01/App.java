public class App {
    public void printArgs(String[] args) {
	for (String arg : args) {
	    System.out.println(arg);
	}
    }

    public String[] toUpperCase(String[] args) {
	for (int i = 0; i < args.length; i++) {
	    args[i] = args[i].toUpperCase();
	}
	return(args);
    }

    public String[] removeChar(String[] args, char c) {
	int i = 0;
	String s = String.valueOf(c);

	for (String arg : args) {
	    args[i] = arg.replace(s, "");
	    i++;
	}
	return(args);
    }
}