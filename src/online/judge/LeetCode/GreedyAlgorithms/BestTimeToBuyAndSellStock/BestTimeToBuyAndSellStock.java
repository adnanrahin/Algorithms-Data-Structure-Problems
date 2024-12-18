package online.judge.LeetCode.GreedyAlgorithms.BestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        int buy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - buy);
        }

        return maxProfit;
    }

}
