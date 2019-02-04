import java.util.List;

public class Shark extends Fish {
    private int nbEatenFishes;

    public Shark() {
    }

    public Shark(String name) {
	super(name);
    }

    public void say() {
        System.out.println(this.name + " say : I'm Hungry!");
    }

    public void eat(Goldfish fish) {
	this.nbEatenFishes += 1;
    }

    public int getNbEatenFishes() {
	return(this.nbEatenFishes);
    }

    public void eat(List fishes) {
	this.nbEatenFishes += fishes.size();
    }
}