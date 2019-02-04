public class Main {
    public static void main(String[] args) {
	Number number = new Number();

	int[] tab = new int[] {5, 10, 70};
	System.out.println(number.getMin(tab));
	System.out.println(number.getMax(tab));
	System.out.println(number.getSum(tab));
	System.out.println(number.getModulus(2, 2));
	System.out.println(number.sort(tab));
    }
}