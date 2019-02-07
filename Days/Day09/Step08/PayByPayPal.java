public class PayByPayPal extends PayPalAPI implements PayStrategy {
    String email;
    String password;

    public PayByPayPal() {
    }

    public PayByPayPal(String email, String password) {
	this.email = email;
	this.password = password;
    }

    public boolean pay(int price) {
	// isSignedIn
	if (!isSignedIn(email)) {
	    System.out.println("Email or password is invalid!");
	    return(false);
	}
	if (payOnline(email, price)) {
	    System.out.println("Payment successful!");
	    return(true);
	}
	return(false);
    }
}