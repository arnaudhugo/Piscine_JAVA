import java.util.ArrayList;
import java.util.List;

public class Player extends Stats {
    private List bag = new ArrayList();
    private Weapon weapon;
    private Stats stats;
    private int maxHealthPoints;
    private int currentHealthPoints;

    public Player() {
    }

    public Player(List items, int maxHealthPoints) {
	this.bag = items;
	this.maxHealthPoints = maxHealthPoints;
    }

    public void takeDamage(int damagePoints) {
	this.currentHealthPoints -= damagePoints;
	if (this.currentHealthPoints < 0)
	    this.currentHealthPoints = 0;
    }

    public void heal(int healthPoints) {
	this.currentHealthPoints += healthPoints;
	if (this.currentHealthPoints > maxHealthPoints)
	    this.currentHealthPoints = maxHealthPoints;
    }

    public int getMaxHealthPoints() {
	return(this.maxHealthPoints);
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
	this.maxHealthPoints = maxHealthPoints;
    }

    public int getCurrentHealthPoints() {
	return(this.currentHealthPoints);
    }

    public void setCurrentHealthPoints(int currentHealthPoints) {
	this.currentHealthPoints = currentHealthPoints;
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

    public Stats getStats() {
	return(this.stats);
    }

    public void setStats(Stats stats) {
	this.stats = stats;
    }
}