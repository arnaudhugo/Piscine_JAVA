public class Order {
    private int price;

    public Order() {
    }

    public Order(int price) {
	this.price = price;
    }

    public void executePaiment(PayStrategy payStrategy) {
	payStrategy.pay(price);
    }
}