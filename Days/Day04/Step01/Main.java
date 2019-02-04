public class Main {
    public static void main(String[] args) {
	Shape circle = new Circle(20);
	System.out.println(circle.getArea());
	System.out.println(((Circle)circle).getRadius());
    }
}