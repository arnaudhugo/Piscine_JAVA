import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
	ItemContainer container = new ItemContainer();

	List<ItemA> items = new ArrayList<>();
	ItemA item = new ItemA();
	item.setName("item1A");
	items.add(item);
	container.addItems(items);

	ItemA item3 = new ItemA();
        item3.setName("item2A");
        items.add(item3);
        container.addItems(items);

	container.showItemsNames();
	System.out.println("count: " + container.count());

	List<ItemB> items2 = new ArrayList<>();
        ItemB item2 = new ItemB();
        item2.setName("item1B");
        items.add(item2);
        container.addItems(items);

        container.showItemsNames();
        System.out.println("count: " + container.count());
    }
}