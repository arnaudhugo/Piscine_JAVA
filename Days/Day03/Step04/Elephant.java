public class Elephant extends Mammal {
    public Elephant() {
    }

    public Elephant(String name, float weight) {
	super(name, weight);
    }

    public void say() {
	System.out.println(this.getWeight());
	System.out.println(name + " say : I'm BIG and HEAVY! (weight : " + weight + ")");
    }

    public void run() {
	System.out.println(name + "I'm running!");
    }
}