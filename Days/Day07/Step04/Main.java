public class Main {
    public static void main(String[] args) {
	String[] words = {"I'm", "working", "on", "generics", "methods", "!"};
	Printer printer = new Printer();
	printer.<String>print(words);
    }
}