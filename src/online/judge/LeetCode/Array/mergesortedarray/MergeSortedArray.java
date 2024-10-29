package online.judge.LeetCode.Array.mergesortedarray;

public class MergeSortedArray {

    public static void main(String[] args) {

        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        merge(new int[]{2, 2, 3, 0, 0, 0}, 3, new int[]{1, 2, 2}, 3);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int ptr = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[ptr] = nums1[i];
                i--;
            } else {
                nums1[ptr] = nums2[j];
                j--;
            }
            ptr--;
        }
    }

}
