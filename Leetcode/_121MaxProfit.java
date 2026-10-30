package Leetcode;

public class _121MaxProfit {

    public static int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Find cheapest price
            minPrice = Math.min(minPrice, prices[i]);

            // Calculate profit
            int profit = prices[i] - minPrice;

            // Keep maximum profit
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(prices));
    }
}