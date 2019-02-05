import java.util.ArrayList;
import java.util.List;

public class DeskImpl<T extends Shape> {
    //private List shapes = new ArrayList();
    private List<T> shapes = new ArrayList<>();

    public DeskImpl() {
    }

    public void addShape(T shape) {
	shapes.add(shape);
    }

    public void drawShapes() {
	for (int i = 0; i < shapes.size(); i++)
	    shapes.get(i).draw();
    }
}