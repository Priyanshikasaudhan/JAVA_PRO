import java.lang.Integer;
import java.util.Scanner;
public class pricesstock {
    public static int MaxPrices(int prices[]) {
        int maxprofit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxprofit = Math.max(maxprofit, profit);
            }else{
            buyPrice = prices[i];
            }
        }
        return maxprofit;
    }
        public static void main(String[] args) {
        // int prices[] = { 7, 1, 5, 3, 6, 4 };
        Scanner pri = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n  = pri.nextInt();
        int prices[] = new int[n];
        System.out.println("Enter the prices of product: ");
        for(int i=0;i<n;i++){
            prices[i] = pri.nextInt();
        }
        System.out.println(MaxPrices(prices));
    }
}
