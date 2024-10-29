package online.judge.LeetCode.BackTracking.permutations;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {

        System.out.println(permute(new int[]{1, 2, 3}));

    }

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) list.add(nums[i]);

        permuteBacktrack(nums, 0, nums.length - 1, list, result);

        return result;

    }

    public static void permuteBacktrack(int[] nums, int start, int end, List<Integer> list, List<List<Integer>> result) {

        if (start == end) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i <= end; i++) {
            swap(list, start, i);
            permuteBacktrack(nums, start + 1, end, list, result);
            swap(list, start, i);
        }

    }

    public static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

}
