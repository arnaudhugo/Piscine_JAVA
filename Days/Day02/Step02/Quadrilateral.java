public class Quadrilateral {
    private double length;
    private double width;

    public Quadrilateral() {
    }
    
    public Quadrilateral(double length, double width) {
	this.length = length;
	this.width = width;
    }

    public double perimeter() {
	double result = this.length * 2 + this.width * 2;
	return(result);
    }

    public double area() {
	double result = (this.length * this.width);
	return(result);
    }

    public boolean isSquare() {
	if (this.length == this.width)
	    return(true);
	else
	    return(false);
    }

    public String toString() {
	return("Length : " + this.length + " Width : " + this.width + " Perimeter : " + perimeter() + " Area : " + area() + " -> " + (isSquare() ? "It's a square" : "It's not a square"));
    }
}