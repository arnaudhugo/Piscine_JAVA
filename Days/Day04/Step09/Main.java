public class Main {
    public static void main(String[] args) {
	try {
	    throw new NotEnoughBalanceException("Not enough balance");
	} catch (NotEnoughBalanceException e) {
	    System.out.println(e.getMessage());
	}
    }
}