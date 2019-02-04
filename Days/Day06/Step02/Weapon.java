public abstract class Weapon {
    protected String name;

    public Weapon() {
    }

    public Weapon(String name) {
	this.name = name;
    }

    public void remove(Player player) {
    }

    public void put(Player player) {
    }

    public String getName() {
	return(this.name);
    }

    public void setName(String name) {
	this.name = name;
    }
}