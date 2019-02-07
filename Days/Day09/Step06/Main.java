public class Main {
    public static void main(String[] args) {
	Account account = new Account();
	String accountId1 = "accountId";

	account.setId(accountId1);

	Bank.addAccount(account);
	Bank.fillBalanceForAccount(accountId1, 5000);

	CreditCard creditCard = new CreditCard("7556");
	creditCard.setAccountId(accountId1);

	PayByCreditCard payByCreditCardStrategy = new PayByCreditCard(creditCard, "7555");
	PayByCreditCard payByCreditCardStrategy2 = new PayByCreditCard(creditCard, "7555");
	PayByCreditCard payByCreditCardStrategy3 = new PayByCreditCard(creditCard, "7555");
	PayByCreditCard payByCreditCardStrategy4 = new PayByCreditCard(creditCard, "7556");

	payByCreditCardStrategy.pay(300);
	payByCreditCardStrategy2.pay(300);
	payByCreditCardStrategy3.pay(300);
	payByCreditCardStrategy4.pay(300);
    }
}