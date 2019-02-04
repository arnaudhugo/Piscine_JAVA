import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
	Player player = new Player(new ArrayList());
	player.setStats(new Stats(100,60));
	Sword sword1 = new Sword("Sword1");
	sword1.setStats(new Stats(50, 60));

	System.out.println("Attack: " + player.getStats().getAttack());
	System.out.println("Defence: " + player.getStats().getDefence());

	player.putWeapon(sword1);

	System.out.println("Attack: " + player.getStats().getAttack());
	System.out.println("Defence: " + player.getStats().getDefence());

	player.removeWeapon();

	System.out.println("Attack: " + player.getStats().getAttack());
        System.out.println("Defence: " + player.getStats().getDefence());
    }
}