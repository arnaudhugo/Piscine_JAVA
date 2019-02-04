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

    public void put(Player player) {
	player.getStats().increaseAttack(damagePoints);
    }

    public void remove(Player player) {
	player.getStats().decreaseAttack(damagePoints);
    }
}