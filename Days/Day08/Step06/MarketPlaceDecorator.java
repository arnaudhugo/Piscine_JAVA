import java.util.ArrayList;
import java.util.List;

public abstract class MarketPlaceDecorator implements MarketPlace {
    List<String> itemList = new ArrayList<>();
    protected MarketPlace marketPlace;

    public MarketPlaceDecorator() {
    }

    public MarketPlaceDecorator(MarketPlace marketPlace) {
	this.marketPlace = marketPlace;
    }

    public List<String> getMarketsNames() {
	return(this.marketPlace.getMarketsNames());
    }

    public void addMarket(String name) {
	this.marketPlace.addMarket(name);
    }
}