import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TradingSystem ts = new TradingSystem();
        Portfolio p = new Portfolio();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Stock Trading Platform ===");
            System.out.println("1. View Market");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    ts.showMarket();
                    break;

                case 2:
                    System.out.print("Enter symbol: ");
                    String buySym = sc.next();
                    System.out.print("Enter quantity: ");
                    int buyQty = sc.nextInt();
                    p.buyStock(buySym, buyQty);
                    break;

                case 3:
                    System.out.print("Enter symbol: ");
                    String sellSym = sc.next();
                    System.out.print("Enter quantity: ");
                    int sellQty = sc.nextInt();
                    p.sellStock(sellSym, sellQty);
                    break;

                case 4:
                    p.showPortfolio();
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
