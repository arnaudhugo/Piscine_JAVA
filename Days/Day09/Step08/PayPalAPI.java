import java.util.ArrayList;
import java.util.List;

public class PayPalAPI {
    static List<PayPalAccount> l_pAccount = new ArrayList<>();

    public PayPalAPI() {
    }

    public static void createAccount(String email, String password) {
	PayPalAccount payPalAccount = new PayPalAccount();
	payPalAccount.setEmail(email);
	payPalAccount.setPassword(password);
	l_pAccount.add(payPalAccount);
    }

    public static boolean signIn(String email, String password) {
	for (PayPalAccount l : l_pAccount) {
	    if (email.equals(l.getEmail()) && password.equals(l.getPassword())) {
		l.setIsSignedIn(true);
		return(true);
	    }
	}
	return(false);
    }

    public static void signOut(String email) {
	for (PayPalAccount l : l_pAccount) {
            if (email.equals(l.getEmail()))
                l.setIsSignedIn(false);
        }
    }

    public static boolean isSignedIn(String email) {
	for (PayPalAccount l : l_pAccount) {
            if (email.equals(l.getEmail()))
                return(l.getIsSignedIn());
	}
	return(false);
    }

    public static void fillBalanceForAccount(String email, int amount) {
	for (PayPalAccount l : l_pAccount) {
            if (email.equals(l.getEmail()) && isSignedIn(email))
                l.setBalance(l.getBalance() + amount);
	}
    }

    public static boolean payOnline(String email, int amount) {
	for (PayPalAccount l : l_pAccount) {
	    if (email.equals(l.getEmail())) {
		if (l.getBalance() > amount) {
		    l.setBalance(l.getBalance() - amount);
		    //System.out.println("Payment successful!");
		    return(true);
		}
		return(false);
	    }
	    else {
		System.out.println("Email or password is invalid!");
		return(false);
	    }
	}
	return(false);
    }
}