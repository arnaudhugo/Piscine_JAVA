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

    public static boolean removeLastFirst(ArrayList list) {
	list.remove(0);
	list.remove(list.size());
	return(true);
    }

    public static void swap(List<String> listOne, int x, int y) {
	String s_x = listOne.get(x);
	listOne.set(x, listOne.get(y));
	listOne.set(y, s_x);

	for (String i : listOne) {
	    System.out.println(i);
	}
    }

    public static List<String> getListFromArray(String[] array) {
	ArrayList<String> arrList = new ArrayList<String>();

	for (String i : array) {
	    arrList.add(i);
	}

	return (arrList);
    }

    public static void sortByAlphabet(List<String> list) {
	
    }

    public static List<String> getReversedListFromArray(String[] array) {
	ArrayList<String> arrList = new ArrayList<String>();

        for (int i = array.length; i > 0; i--) {
            arrList.add(array[i]);
        }

        return (arrList);
    }
}