import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
	List<Weapon> weapons = new ArrayList<>();
	Player player = new Player(weapons);
	Weapon katana = new Katana("Katana");
	player.addItem(katana);
	System.out.println(player.getWeapons().size());
	player.putWeapon(katana);
	System.out.println(player.getWeapons().size());
    }
}