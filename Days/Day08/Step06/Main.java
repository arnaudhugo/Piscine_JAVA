import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
	MarketPlace amazon = new Amazon();
	amazon.addMarket("usa-shop1");
	amazon.addMarket("germany-shop2");

	List<String> productList = amazon.getMarketsNames();

	for(String market: productList) {
	    System.out.println(market);
	}
    }
}