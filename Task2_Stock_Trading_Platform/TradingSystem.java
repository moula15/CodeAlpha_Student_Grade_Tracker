import java.util.ArrayList;

public class TradingSystem {
    private ArrayList<Stock> market = new ArrayList<>();

    public TradingSystem() {
        market.add(new Stock("AAPL", 180.50));
        market.add(new Stock("GOOGL", 2800.75));
        market.add(new Stock("TSLA", 750.20));
        market.add(new Stock("AMZN", 3400.10));
    }

    public void showMarket() {
        System.out.println("\n=== Stock Market Data ===");
        for (Stock s : market) {
            System.out.println(s.getSymbol() + " → $" + s.getPrice());
        }
    }
}
