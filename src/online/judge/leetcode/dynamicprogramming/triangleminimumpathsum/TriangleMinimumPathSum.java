package online.judge.leetcode.dynamicprogramming.triangleminimumpathsum;

import java.util.List;

public class TriangleMinimumPathSum {

    public static void main(String[] args) {

    }

    public static int minimumTotal(List<List<Integer>> triangle) {

        int[] dp = new int[triangle.size() + 1];

        for (int i = triangle.size() - 1; i >= 0; i--) {
            List<Integer> localList = triangle.get(i);
            for (int j = 0; j < localList.size(); j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + localList.get(j);
            }
        }

        return dp[0];
    }

}
