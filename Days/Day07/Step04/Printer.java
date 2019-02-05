public class Printer<T> {
    public Printer() {
    }

    public void print(T[] words) {
	for (T word : words)
	    System.out.println(word);
    }
}