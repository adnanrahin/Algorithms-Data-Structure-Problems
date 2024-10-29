package online.judge.LeetCode.Array.searchinsertposition;

public class SearchInsertPosition {

    public static void main(String[] args) {

        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));

    }

    public static int searchInsert(int[] nums, int target) {

        if (nums.length == 0) return 0;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) {
                right = mid - 1;
            } else left = mid + 1;
        }
        return right + 1;
    }

}
