package online.judge.LeetCode.Array.maximumsubarraysum;

public class MaximumSubArraySum {

    public static void main(String[] args) {

        System.out.println(maxSubArray(new int[]{-2, 1, -1, 2, 3, -5}));

    }

    public static int maxSubArray(int[] nums) {

        if (nums.length == 0) return 0;

        int globalMax = nums[0], localMax = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (localMax + nums[i] < nums[i]) {
                localMax = 0;
            }
            localMax += nums[i];
            globalMax = Math.max(localMax, globalMax);

        }
        return globalMax;

    }

}
