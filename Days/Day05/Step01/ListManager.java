import java.util.ArrayList;
import java.util.List;

public class ListManager {
    public ListManager() {
    }

    public static ArrayList<String> getEmptyList() {
	ArrayList<String> arrList = new ArrayList<String>();

	return(arrList);
    }

    public static int addToList(List<String> list, int position, String element) {
	list.add(position, element);
	return(list.size());
    }

    public static ArrayList<Integer> getListOfNumbers(int from, int to) {
	ArrayList<Integer> arrList = new ArrayList<Integer>();

	for (int i = from; i <= to; i++) {
	    arrList.add(i);
	}
	return(arrList);
    }

    public static ArrayList<Integer> getReversedListOfNumbers(int from, int to) {
	ArrayList<Integer> arrList = new ArrayList<Integer>();

	for (int i = to; i >= from; i--) {
	    arrList.add(i);
	}
	return(arrList);
    }
}