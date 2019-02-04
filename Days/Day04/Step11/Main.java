public class Main {
    public static void main(String[] args) {
	Money money = new Money(5);

	System.out.println(money.getBalance());
	System.out.println(money.haveMoney());
	try {
	    money.useBalance(5);
	} catch (NumberErrorException | NotEnoughBalanceException e) {
	    System.out.println(e.getMessage());
	}
	System.out.println(money.getBalance());
    }
}