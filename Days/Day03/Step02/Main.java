public class Main {
    public static void main(String[] args) {
	Elephant e = new Elephant("Elephant" , (float) 3.4);
	Elephant e1 = new Elephant("Elephant" , (float) 4.88);
	Tiger t = new Tiger("Tigre", (float) 4.548964);

	System.out.println(e.getName());
	System.out.println(e.getWeight());
	e.say();
	System.out.println(e1.getName());
	System.out.println(e1.getWeight());
	e1.say();
	System.out.println(t.getName());
	System.out.println(t.getWeight());
	t.say();
    }
}