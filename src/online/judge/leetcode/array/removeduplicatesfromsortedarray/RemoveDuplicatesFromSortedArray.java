package online.judge.leetcode.array.removeduplicatesfromsortedarray;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        System.out.println(new Solution().removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));

    }

}

class Solution {
    public int removeDuplicates(int[] nums) {

        int slowPtr = 0;

        for (int fastPtr = 0; fastPtr < nums.length; fastPtr++) {
            if (nums[slowPtr] != nums[fastPtr]) {
                slowPtr++;
                nums[slowPtr] = nums[fastPtr];
            }
        }

        return slowPtr + 1;

    }
}