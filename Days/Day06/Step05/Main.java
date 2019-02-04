import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
	Player player = new Player(new ArrayList<>(), 100);
	player.setCurrentHealthPoints(90);
	System.out.println("" + player.getCurrentHealthPoints() + " " + player.getMaxHealthPoints());

	player.takeDamage(10);
	System.out.println("" + player.getCurrentHealthPoints() + " " + player.getMaxHealthPoints());

	player.heal(20);
	System.out.println("" + player.getCurrentHealthPoints() + " " + player.getMaxHealthPoints());
    }
}