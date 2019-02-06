import java.util.ArrayList;
import java.util.List;

public class Amazon implements MarketPlace {
    private List<String> products = new ArrayList<>();

    public Amazon() {
    }

    public List<String> getProducts() {
        return(this.products);
    }

    public void addProduct(String id) {
        products.add(id);
    }    
}