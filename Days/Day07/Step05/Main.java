public class Main {
    public static void main(String[] args) {
	Shape circle = new Circle();
	Shape rectangle = new Rectangle();

	DeskImpl<Shape> dS = new DeskImpl<>();
	dS.addShape(circle);
	dS.addShape(rectangle);

	dS.drawShapes();
    }
}