public class PayPalAccount extends Account {
    private String email;
    private String password;
    private int balance;
    private boolean isSignedIn;

    public PayPalAccount() {
    }

    public String getEmail() {
	return(this.email);
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getPassword() {
	return(this.password);
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public int getBalance() {
	return(this.balance);
    }

    public void setBalance(int balance) {
	this.balance = balance;
    }

    public boolean getIsSignedIn() {
	return(this.isSignedIn);
    }

    public void setIsSignedIn(boolean isSignedIn) {
	this.isSignedIn = isSignedIn;
    }
}