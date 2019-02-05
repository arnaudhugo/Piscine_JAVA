public class ColoredRectangle extends Rectangle implements Colorfull {
    private String color;

    public ColoredRectangle() {
    }

    public void draw() {
        System.out.println("I'm a " + color + " rectangle!");
    }

    public String getColor() {
        return(this.color);
    }

    public void setColor(String color) {
        this.color = color;
    }
}