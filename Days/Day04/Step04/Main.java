public class Main {
    public static void main(String[] args) {
	Circle circleOne = new Circle(10);
	Rectangle rectTwo = new Rectangle(40, 40);
	Desk desk = new Desk();
	desk.addShape(circleOne);
	desk.addShape(rectTwo);
	desk.drawCircles();
    }
}