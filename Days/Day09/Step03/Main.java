public class Main {
    public static void main(String[] args) {
	Key k = new Key("key1");
	Game g1 = new PlusMinusGame("PlusMinusGame", null, k, 59);
	Game g2 = new PlusMinusGame("PlusMinusGame", k, k, 59);

	boolean one = g1.play(null, "1 2 3 100 59");
	boolean two = g2.play(null, "1 2 3 100 10 40 30 60 50 40");
	boolean three = g2.play(k, "1 2 3 100 10 40 30 60 50 40");

	System.out.println("g1: " + one);
	System.out.println("g2:" + two);
	System.out.println("g2:" + three);
    }
}