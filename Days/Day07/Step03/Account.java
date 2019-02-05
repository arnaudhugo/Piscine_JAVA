public class Account implements Accountable {
    String id;
    int sum;

    public Account(String id, int sum) {
	this.id = id;
	this.sum = sum;
    }

    public String getId() {
	return(this.id);
    }

    public void setId(int sum) {
	this.sum = sum;
    }

    public int getSum() {
	return(this.sum);
    }

    public void setSum(int sum) {
	this.sum = sum;
    }
}