public class Desk {
    Shape[] tab;
    
    public Desk() {
	tab = new Shape[1000];
    }

    public void draw() {
	for (Shape s : tab) {
	    if (s != null)
		s.draw();
	}
    }

    public void addShape(Shape shape) {
	for (int i = 0; i < tab.length; i++) {
	    if (tab[i] == null) {
		tab[i] = shape;
		break;
	    }
	}
    }

    public void addShapes(Shape[] shapes) {
	int i = 0;

	for (Shape s : shapes) {
	    addShape(shapes[i]);
	    i++;
	}
    }

    public void drawRectangles() {
	for (Shape s : tab) {
            if (s != null && s.getClass().getName() == "Rectangle")
                s.draw();
        }
    }

    public void drawCircles() {
	for (Shape s : tab) {
            if (s != null && s.getClass().getName() == "Circle")
                s.draw();
        }
    }
}