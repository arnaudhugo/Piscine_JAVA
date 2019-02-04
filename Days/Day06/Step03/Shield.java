public class Shield extends Weapon {
    private int defence;
    private WeaponType type;

    public Shield() {
    }

    public Shield(String name) {
	super(name);
	this.type = WeaponType.SHIELD;
    }
}