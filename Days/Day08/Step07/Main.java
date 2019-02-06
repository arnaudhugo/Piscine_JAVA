import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
	MarketPlace amazonFilteredProducts = new FilteredProductsDecorator(new Amazon());

	amazonFilteredProducts.addMarket("fr-shopOne");
	amazonFilteredProducts.addMarket("en-shopTwo");
	amazonFilteredProducts.addMarket("fr-shopThree");

	List<String> productList = amazonFilteredProducts.getMarketsNames();

	for(String name: productList) {
	    System.out.println(name);
	}
    }
}