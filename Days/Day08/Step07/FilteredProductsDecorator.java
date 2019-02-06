import java.util.ArrayList;
import java.util.List;

public class FilteredProductsDecorator extends MarketPlaceDecorator {
    public FilteredProductsDecorator() {
    }

    public FilteredProductsDecorator(MarketPlace marketPlace) {
	super(marketPlace);
    }

    public List<String> getMarketsNames() {
	this.marketPlace.getMarketsNames().removeIf(item -> !item.matches("(^fr-.+)"));
	return(this.marketPlace.getMarketsNames());
    }
}