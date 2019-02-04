public class Tiger extends Mammal {
    public Tiger() {
    }

    public Tiger(String name, float weight) {
	super(name, weight);
    }

    public void say() {
	System.out.println(name + " (weight : " + weight + ") say : I will eat you! (" + weight + ")");
    }
}