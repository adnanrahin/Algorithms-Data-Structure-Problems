package online.judge.LeetCode.DynamicProgramming.minimumpathsum;

public class MinimumPathSum {

    public static void main(String[] args) {

        System.out.println(minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));

    }

    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dpTable = new int[m][n];
        dpTable[0][0] = grid[0][0];

        for (int i = 1; i < m; i++) dpTable[i][0] = grid[i][0] + dpTable[i - 1][0];

        for (int i = 1; i < n; i++) dpTable[0][i] = grid[0][i] + dpTable[0][i - 1];


        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dpTable[i][j] = grid[i][j] + Math.min(dpTable[i][j - 1], dpTable[i - 1][j]);
            }
        }

        return dpTable[m - 1][n - 1];
    }

}
