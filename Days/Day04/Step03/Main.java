public class Main {
    public static void main(String[] args) {
	Circle circleOne = new Circle(10);
	Shape shape = new Rectangle(5,10);
	Desk desk = new Desk();
	desk.addShape(circleOne);
	desk.addShape(shape);
	desk.draw();
    }
}