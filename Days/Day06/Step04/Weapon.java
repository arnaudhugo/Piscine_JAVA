public abstract class Weapon implements Item {
    protected String name;
    protected WeaponType type;

    public Weapon() {
    }

    public Weapon(String name) {
	this.name = name;
    }

    public String getName() {
	return(this.name);
    }

    public void setName(String name) {
	this.name = name;
    }
}