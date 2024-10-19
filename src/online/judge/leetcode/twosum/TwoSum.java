package online.judge.leetcode.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));

    }

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int sum = target - nums[i];

            if (map.containsKey(sum)) {
                return new int[]{map.get(sum), i};
            }
            map.put(nums[i], i);
        }

        return res;
    }
}
