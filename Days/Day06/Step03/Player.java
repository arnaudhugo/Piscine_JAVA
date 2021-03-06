import java.util.ArrayList;
import java.util.List;

public class Player {
    private List bag = new ArrayList();
    private Weapon weapon;

    public Player() {
    }

    public Player(List items) {
	this.bag = items;
    }

    public Weapon getWeapon() {
	return(this.weapon);
    }

    public void removeWeapon() {
        if (this.getWeapon() != null)
            this.getWeapon().remove(this);
        if (!bag.contains(weapon)) {
            bag.add(weapon);
        }
        this.weapon = null;
    }

    public void putWeapon(Weapon weapon) {
        if (weapon != null)
            this.removeWeapon();
        for (int i = 0; i < bag.size(); i++) {
            if (bag.get(i) == weapon)
                bag.remove(i);
        }
        this.weapon = weapon;
        weapon.put(this);
    }

    public void addItem(Item item) {
	bag.add(item);
    }

    public List<Weapon> getWeapons() {
	List<Weapon> list = new ArrayList<>();

	for (int i = 0; i < bag.size(); i++) {
	    if (bag.get(i) instanceof Weapon)
		list.add((Weapon) bag.get(i));
	}
	return(list);
    }
}