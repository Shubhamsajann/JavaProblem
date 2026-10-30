package Level3;

public class _66MaxProfit {
    public static void main(String[] args) {
        int[] prices = {2, 3, 1, 1, 2, 1, 1, 1, 2};

        int minPrice =  Integer.MAX_VALUE;;
        int maxProfit = 0;

        for (int num : prices) {

            minPrice = Math.min(num, minPrice);

            maxProfit = Math.max(maxProfit, num - minPrice);

        }
        System.out.println(maxProfit);

    }






}
