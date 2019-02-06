import java.util.ArrayList;
import java.util.List;

public interface MarketPlace {
    List<String> getProducts();

    void addProduct(String id);
}