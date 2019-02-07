public class CreditCard {
    String accountId;
    String pinCode;
    int attempts;

    public CreditCard() {
    }

    public CreditCard(String pin) {
	this.pinCode = pin;
    }

    public String getAccountId() {
	return(this.accountId);
    }

    public void setAccountId(String accountId) {
	this.accountId = accountId;
    }

    public String getPinCode() {
	return(this.pinCode);
    }

    public void setPinCode(String pinCode) {
	this.pinCode = pinCode;
    }

    public int getAttempts() {
	return(this.attempts);
    }

    public void setAttempts(int attempts) {
	this.attempts = attempts;
    }
}