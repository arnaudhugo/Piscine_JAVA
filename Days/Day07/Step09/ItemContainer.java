import java.util.ArrayList;
import java.util.List;

public class ItemContainer {
    List<ItemA> itemList = new ArrayList<>();

    public ItemContainer() {
    }

    public void addItems(List<? super ItemA> items) {
	for (int i = 0; i < items.size(); i++) {
	    /*
	    if (items.get(i).getClass().getName() == "ItemA")
		itemList.add((ItemA) items.get(i));
	    */
	    itemList.add((ItemA) items.get(i));
	}
    }

    public void showItemsNames() {
	for (int i = 0; i < itemList.size(); i++) {
	    if (itemList.get(i).getClass().getName() == "ItemA")
		System.out.println(itemList.get(i).getName());
	}
    }

    public int count() {
	return(itemList.size());
    }
}