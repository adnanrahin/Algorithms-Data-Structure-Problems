package online.judge.LeetCode.String.findthedifference;

public class FindTheDifference {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.findTheDifference("abcd", "abced"));

    }
}

class Solution {
    public char findTheDifference(String s, String t) {
        int[] charArray = new int[26];
        for(int i = 0; i < t.length(); i++){
            charArray[t.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            charArray[s.charAt(i)- 'a']--;
        }

        for(int i = 0; i < 26; i++){
            if(charArray[i] > 0){
                return (char) (i + 'a');
            }
        }
        return '1';
    }
}

