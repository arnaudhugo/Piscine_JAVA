public interface Accountable<T> {
    abstract int getSum();

    abstract void setSum(int sum);

    abstract T getId();
}