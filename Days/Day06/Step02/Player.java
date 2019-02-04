import java.util.ArrayList;
import java.util.List;

public class Player {
    private List bag = new ArrayList();

    public Player() {
    }

    public Player(List items) {
	this.bag = items;
    }
}