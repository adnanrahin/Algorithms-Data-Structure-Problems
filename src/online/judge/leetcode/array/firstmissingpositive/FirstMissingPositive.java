package online.judge.leetcode.array.firstmissingpositive;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive {

    public static void main(String[] args) {

    }

    public static int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int missingPositive = nums[0];
        for (int i = 0; i < nums.length; i++) {
            missingPositive = Math.max(missingPositive, nums[i]);
            set.add(nums[i]);
        }
        for (int i = 1; i <= missingPositive; i++) {
            if (!set.contains(i)) return i;
        }
        return missingPositive < 0 ? 1 : missingPositive + 1;
    }

}
