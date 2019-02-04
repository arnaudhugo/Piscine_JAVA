public class Money {
    private float balance;

    public Money() {
    }

    public Money(float balance) {
	this.balance = (balance > 0 ? balance : 0);
    }

    public float getBalance() {
	return(this.balance);
    }

    public void setBalance(float balance) {
	this.balance = balance;
    }

    public boolean haveMoney() {
	return(this.balance > 0);
    }

    public void addBalance(float money) throws NumberErrorException {
	if (money > 0)
	    this.balance += money;
	else
	    throw new NumberErrorException("Impossible to add a negative number!");
    }

    public boolean enoughBalance(float money) {
	if (this.balance >= money)
	    return(true);
	return(false);
    }

    public void useBalance(float money) throws NumberErrorException, NotEnoughBalanceException {
	if (money < 0)
	    throw new NumberErrorException("Can not subtract a negative number!");
	else if (!enoughBalance(money))
	    throw new NotEnoughBalanceException("Not enough balance!");
	else
	    this.balance -= money;
    }
}