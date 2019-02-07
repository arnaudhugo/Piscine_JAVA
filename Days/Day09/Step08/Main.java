public class Main {
    public static void main(String[] args) {
	Order order = new Order(100);
	Order order2 = new Order(200);

	order.executePaiment(new PayByCreditCard());
	order.executePaiment(new PayByPayPal());
    }
}