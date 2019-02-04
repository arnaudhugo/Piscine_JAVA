public class Main {
    public static void main(String[] args) {
	Goldfish gf = new Goldfish("Poisson rouge");
	Shark s = new Shark("Requin");

	System.out.println(gf.getName());
	gf.say();
	System.out.println(s.getName());
	s.say();

	Elephant e = new Elephant("Eléphant" , (float) 3.4);
	Animal t = new Tiger("Tigre", (float) 4.5454564654654);

	System.out.println(e.getName());
	e.say();
	System.out.println(t.getName());
	t.say();
    }
}