public class Account<T> {
    private T id;
    private int sum;

    public Account() {
    }

    public Account(T id, int sum) {
	this.id = id;
	this.sum = sum;
    }

    public T getId() {
	return(this.id);
    }

    public void setId(T id) {
	this.id = id;
    }

    public int getSum() {
	return(this.sum);
    }

    public void setSum(int sum) {
	this.sum = sum;
    }
}