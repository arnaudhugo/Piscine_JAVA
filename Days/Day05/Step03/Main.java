import java.util.*;

public class Main {
    public static void main(String[] args) {
	ListManager lm = new ListManager();
	List<Integer> listOne = new ArrayList<>();
	List<Integer> listTwo = new ArrayList<>();
	listOne.add(1);
	listOne.add(2);
	listOne.add(3);
	listTwo.add(1);
	listTwo.add(2);
	System.out.println(lm.haveSameElements(listOne, listTwo));
	System.out.println(lm.getCommonElements(listOne, listTwo));
    }
}