package online.judge.LeetCode.GreedyAlgorithms.BestTimeToBuyAndSellStockII;

public class BestTimeToBuyAndSellStockII {

    public static void main(String[] args) {

        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{1, 2, 3, 4, 5}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));

    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        int buy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            }
            if (prices[i] - buy > 0) {
                maxProfit += (prices[i] - buy);
                buy = prices[i];
            }
        }

        return maxProfit;
    }

}
