public class Account<T, U> {
    private T id;
    private U sum;

    public Account() {
    }

    public Account(T id, U sum) {
	this.id = id;
	this.sum = sum;
    }

    public T getId() {
	return(this.id);
    }

    public void setId(T id) {
	this.id = id;
    }

    public U getSum() {
	return(this.sum);
    }

    public void setSum(U sum) {
	this.sum = sum;
    }
}