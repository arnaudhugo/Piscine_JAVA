public class Main {
    public static void main(String[] args) {
	Money money = new Money(100);
	System.out.println(money.getBalance());
	System.out.println(money.haveMoney());
	try {
	    money.addBalance(-100);
	} catch (NumberErrorException e) {
	    System.out.println(e.getMessage());
	}
    }
}