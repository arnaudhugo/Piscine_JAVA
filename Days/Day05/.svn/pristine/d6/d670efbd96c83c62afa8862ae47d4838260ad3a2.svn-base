import java.util.ArrayList;
import java.util.List;

public class ListManager {
    public ListManager() {
    }

    public boolean haveSameElements(List a, List b) {
	for (int i = 0; i < a.size(); i++) {
	    for (int j = 0; j < b.size(); j++) {
		if (a.get(i) == b.get(j))
		    return(true);
	    }
	}
	return(false);
    }

    public List getCommonElements(List a, List b) {
	List<Integer> arrList = new ArrayList<>();

	for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (a.get(i) == b.get(j))
		    arrList.add((int) a.get(i));
            }
        }
	return(arrList);
    }
}