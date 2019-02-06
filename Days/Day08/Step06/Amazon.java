import java.util.ArrayList;
import java.util.List;

public class Amazon implements MarketPlace {
    private List<String> markets = new ArrayList<>();

    public Amazon() {
    }

    public List<String> getMarketsNames() {
	return(markets);
    }

    public void addMarket(String name) {
	markets.add(name);
    }
}