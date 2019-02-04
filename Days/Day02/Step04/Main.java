public class Main {
    public static void main(String[] args) {
	HealthBar hb1 = new HealthBar("Healthbar of the first player", 50, 100);
	HealthBar hb2 = new HealthBar("Healthbar of the second player", 100, 1000);
	Player player1 = new Player("PlayerOne", 10, hb1);
	Player player2 = new Player("PlayerTwo",50,hb2);

	player1.attack(player2, 30);
	player1.attack(player2, 10);

	System.out.println(player1.getHealthBar().getCurrentPoints());
	System.out.println(player2.getHealthBar().getCurrentPoints());
    }
}