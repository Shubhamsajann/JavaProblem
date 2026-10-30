public class _16BestTimeToBuySellStock {

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int ans = maxProfit(prices);

        System.out.println(ans);

    }

    private static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i <prices.length ; i++) {
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }


            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {

                maxProfit = profit;

            }

        }

        return maxProfit;

        }
    }

