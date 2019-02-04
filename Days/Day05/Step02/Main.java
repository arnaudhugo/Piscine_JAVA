import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
	List<String> listOfStrings = new ArrayList<String>();
	for (int i = 0; i < 5; i++) {
	    ListManager.addToList(listOfStrings, i, String.valueOf(i));
	    System.out.println(listOfStrings.get(i));
	}
	System.out.println("After swap");
	ListManager.swap(listOfStrings, 1, 4);
    }
}