public class Main {
    public static void main(String[] args) {
	DeskImpl<Circle, ColoredCircle> dC = new DeskImpl<>();

	ColoredCircle coloredCircle1 = new ColoredCircle();
	ColoredCircle coloredCircle2 = new ColoredCircle();

	coloredCircle1.setColor("Green");
	coloredCircle2.setColor("Red");

	dC.addColoredShape(coloredCircle1);
	dC.addColoredShape(coloredCircle2);
	dC.drawColoredShapes();
    }
}