package online.judge.LeetCode.String.longestpalindrome;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.longestPalindrome("abccccd"));
        System.out.println(solution.longestPalindrome("a"));
        System.out.println(solution.longestPalindrome("abccccdd"));
        System.out.println(solution.longestPalindrome("abccccd"));
        System.out.println(solution.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));

    }

}

class Solution {
    public int longestPalindrome(String s) {

        int longestPalindromeLength = 0;
        boolean hasOddFrequency = false;

        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            charMap.put(s.charAt(i), charMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (Character ch : charMap.keySet()) {
            int freq = charMap.get(ch);
            if (freq % 2 == 0) {
                longestPalindromeLength += freq;
            } else {
                longestPalindromeLength += freq - 1;
                hasOddFrequency = true;
            }
        }

        return hasOddFrequency ? longestPalindromeLength + 1 : longestPalindromeLength;
    }
}