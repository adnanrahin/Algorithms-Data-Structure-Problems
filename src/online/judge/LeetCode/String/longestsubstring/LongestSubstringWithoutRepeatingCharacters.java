package online.judge.LeetCode.String.longestsubstring;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));

    }

}

class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s == null || s.isEmpty()) return 0;

        int global = 0, local = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(s.charAt(i))) {
                local = Math.max(local, map.get(ch));
            }
            map.put(ch, i + 1);
            global = Math.max(i + 1 - local, global);
        }
        return global;
    }
}