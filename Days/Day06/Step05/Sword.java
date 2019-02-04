public class Sword extends Weapon {
    private WeaponType type;
    private Stats stats;

    public Sword() {
    }

    public Sword(String name) {
	super(name);
	this.type = WeaponType.SWORD;
    }

    public void setStats(Stats stats) {
	this.stats = stats;
    }

    public void put(Player player) {
	player.getStats().increaseAttack(stats.getAttack());
	player.getStats().increaseDefence(stats.getDefence());
    }

    public void remove(Player player) {
	player.getStats().decreaseAttack(stats.getAttack());
	player.getStats().decreaseDefence(stats.getDefence());
    }
}