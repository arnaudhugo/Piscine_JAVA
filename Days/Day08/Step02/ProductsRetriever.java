import java.util.ArrayList;
import java.util.List;

public class ProductsRetriever {
    private Amazon amazon = new Amazon();;
    private CDiscount cdiscount = new CDiscount();
    private Fnac fnac = new Fnac();

    public ProductsRetriever() {
    }

    public List<String> getAmazonList() {
	return(amazon.getProducts());
    }

    public void addProductToAmazon(String id) {
	amazon.addProduct(id);
    }

    public List<String> getCdiscountList() {
	return(cdiscount.getProducts());
    }

    public void addProductToCdiscount(String id) {
	cdiscount.addProduct(id);
    }

    public List<String> getFnacList() {
	return(fnac.getProducts());
    }

    public void addProductToFnac(String id) {
	fnac.addProduct(id);
    }
}