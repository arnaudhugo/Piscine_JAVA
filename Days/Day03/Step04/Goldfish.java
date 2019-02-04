public class Goldfish extends Fish {
    public Goldfish() {
    }

    public Goldfish(String name) {
	super(name);
    }

    public void say() {
	System.out.println(this.name + " say : Only 3s memory!");
    }

    public void swim() {
	System.out.println(name + ": I'm swimming!");
    }
}