package online.judge.leetcode.dynamicprogramming.climbindstairs;

public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(5));
        System.out.println(climbStairs(6));
        System.out.println(climbStairs(7));
    }

    public static int climbStairs(int n) {
        if (n <= 3) return n;
        int[] dpTable = new int[n + 1];
        dpTable[0] = 0;
        dpTable[1] = 1;
        dpTable[2] = 2;
        for (int i = 3; i <= n; i++) {
            dpTable[i] = dpTable[i - 1] + dpTable[i - 2];
        }
        return dpTable[n];
    }

}
