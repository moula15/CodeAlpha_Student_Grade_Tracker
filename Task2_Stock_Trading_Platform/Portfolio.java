import java.util.HashMap;

public class Portfolio {
    private HashMap<String, Integer> holdings = new HashMap<>();

    public void buyStock(String symbol, int qty) {
        holdings.put(symbol, holdings.getOrDefault(symbol, 0) + qty);
        System.out.println(qty + " shares of " + symbol + " bought.");
    }

    public void sellStock(String symbol, int qty) {
        if (!holdings.containsKey(symbol) || holdings.get(symbol) < qty) {
            System.out.println("Not enough shares to sell!");
            return;
        }

        holdings.put(symbol, holdings.get(symbol) - qty);
        System.out.println(qty + " shares of " + symbol + " sold.");

        if (holdings.get(symbol) == 0) {
            holdings.remove(symbol);
        }
    }

    public void showPortfolio() {
        System.out.println("\n=== Your Portfolio ===");
        if (holdings.isEmpty()) {
            System.out.println("No stocks bought yet.");
            return;
        }

        for (String symbol : holdings.keySet()) {
            System.out.println(symbol + " → " + holdings.get(symbol) + " shares");
        }
    }
}
