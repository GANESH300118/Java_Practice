import java.util.*;
class NKAStockprice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int a = scanner.nextInt(); 
        int[] stocks = new int[n];
        int[] profits = new int[n];
        for (int i = 0; i < n; i++) {
            stocks[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            profits[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (profits[j] < profits[j + 1]) {
                    int ptemp = profits[j];
                    int stemp = stocks[j];
                    stocks[j] = stocks[j + 1];
                    profits[j] = profits[j + 1];
                    profits[j + 1] = ptemp;
                    stocks[j + 1] = stemp;
                }
            }
        }
        int profit = 0;
        for (int i = 0; i < n; i++) {
            int maxStocksToBuy = Math.min(k, a / stocks[i]);
            profit += (profits[i] * maxStocksToBuy * stocks[i]) / 100;
            a -= maxStocksToBuy * stocks[i];
        }
        System.out.println(profit);
        scanner.close();
    }
}