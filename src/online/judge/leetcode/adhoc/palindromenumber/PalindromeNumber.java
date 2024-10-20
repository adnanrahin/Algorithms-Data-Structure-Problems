package online.judge.leetcode.adhoc.palindromenumber;

public class PalindromeNumber {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(-121));

    }

}

class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) return false;

        int hold = x;
        int res = 0, rem = 0;

        while (x != 0) {
            int mod = x % 10;
            x = x / 10;
            res = res * 10 + mod;
        }

        return hold == res;

    }
}
