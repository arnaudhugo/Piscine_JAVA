public class Main {
    public static void main(String[] args) {
	Goldfish gf = new Goldfish("GoldFish");
	Shark s = new Shark("Shark");
	System.out.println(gf.getName());
	gf.say();
	System.out.println(s.getName());
	s.say();
	s.eat(gf);
	System.out.println("Number of eaten fishes:" + s.getNbEatenFishes());

    }
}