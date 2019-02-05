public class ColoredCircle extends Circle implements Colorfull {
    private String color;

    public ColoredCircle() {
    }

    public void draw() {
        System.out.println("I'm a " + color + " circle!");
    }

    public String getColor() {
	return(this.color);
    }

    public void setColor(String color) {
	this.color = color;
    }
}