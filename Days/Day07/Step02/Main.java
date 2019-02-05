public class Main {
    public static void main(String[] args) {
	Account<String, Integer> account = new Account<String, Integer>("497", 74634);
	String id = account.getId();
	int sum = account.getSum();
	System.out.println("id: " + id);
	System.out.println("sum: " + sum);
    }
}