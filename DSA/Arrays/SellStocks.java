package DSA.Arrays;

public class SellStocks {
    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                // if today price is greater than previous stock buying price
                int todayProfit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, todayProfit);
            } else {
                // if today price is less than previous stock buying price
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSellStocks(prices));
    }

}
