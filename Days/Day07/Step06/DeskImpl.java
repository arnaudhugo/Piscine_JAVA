import java.util.ArrayList;
import java.util.List;

public class DeskImpl<T extends Shape, U extends Colorfull> {
    //private List shapes = new ArrayList();
    private List<T> shapes = new ArrayList<>();
    private List<U> shapes_c = new ArrayList<>();

    public DeskImpl() {
    }

    public void addShape(T shape) {
	shapes.add(shape);
    }

    public void drawShapes() {
	for (int i = 0; i < shapes.size(); i++)
	    shapes.get(i).draw();
    }

    public void drawColoredShapes() {
	for (int i = 0; i < shapes_c.size(); i++) {
            shapes_c.get(i).draw();
	}
    }

    public void addColoredShape(U shape) {
	shapes_c.add(shape);
    }
}