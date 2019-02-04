class Stats {
    private int attack;
    private int defence;

    public Stats() {
    }

    public Stats(int attack, int defence) {
	this.attack = attack;
	this.defence = defence;
    }

    public int getAttack() {
	return(this.attack);
    }

    public void setAttack(int attack) {
	this.attack = attack;
    }

    public int getDefence() {
	return(this.defence);
    }

    public void setDefence(int defence) {
	this.defence = defence;
    }

    public void increaseAttack(int attack) {
	this.attack += attack;
    }

    public void increaseDefence(int defence) {
	this.defence += defence;
    }

    public void decreaseAttack(int attack) {
	this.attack -= attack;
	if (this.attack < 0)
	    this.attack = 0;
    }

    public void decreaseDefence(int defence) {
	this.defence -= defence;
	if (this.defence < 0)
	    this.defence = 0;
    }
}