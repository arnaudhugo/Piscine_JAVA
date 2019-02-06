import java.util.ArrayList;
import java.util.List;

public class ProductsRetriever {
    private Amazon amazon;
    private CDiscount cdiscount;
    private Fnac fnac;

    public ProductsRetriever() {
	amazon = new Amazon();
	cdiscount = new CDiscount();
	fnac = new Fnac();
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