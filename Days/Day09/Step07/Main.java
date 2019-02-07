public class Main {
    public static void main(String[] args) {
	String payPalAccountEmail = "test@test.fr";
	String payPalAccountPassword = "mdp123";

	PayPalAccount payPalAccount = new PayPalAccount();
	payPalAccount.setEmail(payPalAccountEmail);
	payPalAccount.setPassword(payPalAccountPassword);

	PayPalAPI.createAccount(payPalAccountEmail, payPalAccountPassword);
	PayPalAPI.signIn(payPalAccountEmail, payPalAccountPassword);
	PayPalAPI.fillBalanceForAccount(payPalAccountEmail, 5000);
	PayByPayPal payPalStrategy = new PayByPayPal(payPalAccountEmail, payPalAccountPassword);

	System.out.println("Payement by paypal:" + payPalStrategy.pay(1000));
    }
}
