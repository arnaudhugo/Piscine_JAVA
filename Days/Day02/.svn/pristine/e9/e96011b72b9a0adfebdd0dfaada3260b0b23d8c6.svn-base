public class Point {
    private int x;
    private int y;

    public Point() {
	
    }

    public Point(int x, int y) {
	this.x = x;
	this.y = y;
    }

    public int getX() {
	return(this.x);
    }

    public int setX(int x) {
	this.x = x;
	return(x);
    }

    public int getY() {
	return(this.y);
    }

    public int setY(int y) {
	this.y = y;
	return(this.y);
    }

    public int distanceTo(Point p) {
	//int diffX = (int) Math.round(Math.pow(x - p.getX(), 2));
        //int diffY = (int) Math.round(Math.pow(y - p.getY(), 2));

	int diffX = (x - p.getX()) * (x - p.getX());
        int diffY = (y - p.getY()) * (y - p.getY());

	return((int) Math.sqrt(diffX + diffY));
    }
}