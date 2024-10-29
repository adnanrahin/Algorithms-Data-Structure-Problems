package online.judge.LeetCode.String.groupanagrams;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

    }

}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> anagrams = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String key = sortString(str);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        for(String key: map.keySet())
            anagrams.add(map.get(key));

        return anagrams;
    }

    public String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

}
