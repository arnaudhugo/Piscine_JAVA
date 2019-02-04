import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
	List<Integer> integers = ListManager.getReversedListOfNumbers(1, 2);
	for (Integer i : integers) {
	    System.out.println("" + i);
	}
    }
}