import java.util.ArrayList;
import java.util.List;

public interface MarketPlace {
    public List<String> getMarketsNames();

    public void addMarket(String name);
}