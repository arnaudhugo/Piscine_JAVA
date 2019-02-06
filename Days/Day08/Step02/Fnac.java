import java.util.ArrayList;
import java.util.List;

public class Fnac implements MarketPlace {
    private List<String> products = new ArrayList<>();

    public Fnac() {
    }

    public List<String> getProducts() {
	return(this.products);
    }

    public void addProduct(String id) {
	products.add(id);
    }

    
}