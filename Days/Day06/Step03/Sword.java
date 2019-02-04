public class Sword extends Weapon {
    private WeaponType type;

    public Sword() {
    }

    public Sword(String name) {
	super(name);
	this.type = WeaponType.SWORD;
    }
}