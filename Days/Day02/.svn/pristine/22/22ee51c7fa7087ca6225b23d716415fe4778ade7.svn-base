public class HealthBar extends Bar {
    private boolean isDead;

    public HealthBar() {
    }

    public HealthBar(String name, int currentPoints, int maxPoint) {
	super(name, currentPoints, maxPoint);
	this.isDead = false;
    }
    
    public int getCurrentPoints() {
	return(currentPoints);
    }

    public void increaseCurrentPoints(int point) {
	if (!isDead)
	    currentPoints += point;
    }

    public void decreaseCurrentPoints(int point) {
	if (!isDead) {
	    currentPoints -= point;
	    if (currentPoints <= 0) {
		this.isDead = false;
		currentPoints = 0;
	    }
	}
    }

    public void increaseMaxPoint(int point) {
	if (!isDead)
	    maxPoint += point;
    }

    public void decreaseMaxPoint(int point) {
	if (!isDead)
	    maxPoint -= point;
    }
}