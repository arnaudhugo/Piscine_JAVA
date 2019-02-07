import java.util.ArrayList;
import java.util.List;

public class Bank {
    static List<Account> l_account = new ArrayList<>();

    public Bank() {
    }

    public static boolean addAccount(Account account) {
	if (l_account.equals(account))
	    return(false);
	else
	    l_account.add(account);
	return(true);
    }

    public static void fillBalanceForAccount(String accountId, int amount) {
	for (Account a : l_account) {
	    if (a.getId().equals(accountId)) {
		a.setBalance(a.getBalance() + amount);
	    }
	}
    }

    public static boolean pay(String accountId, int amount) {
	for (Account a : l_account) {
	    if (a.getId().equals(accountId)) {
		if (a.getBalance() > amount) {
		    a.setBalance(a.getBalance() - amount);
		    return(true);
		}
		else {
		    System.out.println("Insufficient funds");
		    return(false);
		}
	    }
	}
	return(false);
    }
}