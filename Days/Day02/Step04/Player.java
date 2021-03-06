public class Player {
    private String name;
    private int score;
    private HealthBar healthBar;

    public Player() {
    }

    public Player(String name, int point, HealthBar healthBar) {
	this.name = name;
	this.score = point;
	this.healthBar = healthBar;
    }

    public HealthBar getHealthBar() {
	return(this.healthBar);
    }

    public void resetScore() {
	this.score = 0;
    }

    public void addScore(int point) {
	this.score += point;
    }

    public void removeScore(int point) {
	this.score -= point;
    }

    public void attack(Player playerToAttack, int damage) {
	if (damage >= 0)
	    playerToAttack.getHealthBar().decreaseCurrentPoints(damage);
    }
}