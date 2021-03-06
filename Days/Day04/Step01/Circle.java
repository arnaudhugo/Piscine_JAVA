public class Circle implements Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
	this.radius = radius;
    }

    public double getRadius() {
	return(this.radius);
    }

    public void setRadius(double radius) {
	this.radius = radius;
    }

    public double getArea() {
	return(Math.PI * radius * radius);
    }

    public void draw() {
	System.out.println("Drawing circle!");
    }
}