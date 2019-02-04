public class Katana extends Weapon {
    private int damagePoints;
    private WeaponType type;

    public Katana() {
    }

    public Katana(String name) {
	super(name);
	this.type = WeaponType.KATANA;
    }

    public WeaponType getType() {
	return(this.type);
    }
}