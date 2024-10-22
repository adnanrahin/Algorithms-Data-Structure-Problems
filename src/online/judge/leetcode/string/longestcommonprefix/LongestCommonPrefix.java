package online.judge.leetcode.string.longestcommonprefix;

import static java.lang.Integer.MAX_VALUE;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        System.out.println(new Solution().longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(new Solution().longestCommonPrefix(new String[]{"dog","racecar","car"}));

    }

}

class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";
        StringBuilder result = new StringBuilder();
        String shortestString = shortestString(strs);

        for (int i = 0; i < shortestString.length(); i++) {
            char ch = shortestString.charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != ch) {
                    return result.toString();
                }
            }
            result.append(ch);
        }

        return result.toString();
    }
    public String shortestString(String[] strs) {
        int len = MAX_VALUE;
        String str = "";
        for (String s : strs) {
            if (len > s.length()) {
                len = s.length();
                str = s;
            }
        }
        return str;
    }
}