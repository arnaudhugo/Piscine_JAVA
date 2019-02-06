public class Main {
    public static void main(String[] args) {
	ProductsRetriever productsRetriever = new ProductsRetriever();
	productsRetriever.addProductToAmazon("amazonProductOne");
	productsRetriever.addProductToCdiscount("cdiscountProductOne");

	for(String id: productsRetriever.getAmazonList()) {
	    System.out.println(id);
	}
	for(String id: productsRetriever.getCdiscountList()) {
	    System.out.println(id);
	}
	for(String id: productsRetriever.getFnacList()) {
	    System.out.println(id);
	}
    }
}