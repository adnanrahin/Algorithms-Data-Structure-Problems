package online.judge.LeetCode.BackTracking.permutationstwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsTwo {

    public static void main(String[] args) {

        System.out.println(permuteUnique(new int[]{1, 1, 2}));
        System.out.println(permuteUnique(new int[]{1, 3, 2}));

    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        backtrack(result, new ArrayList<>(), nums, visited);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] visited) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {

                if (visited[i] || (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])) continue;
                visited[i] = true;
                tempList.add(nums[i]);
                backtrack(result, tempList, nums, visited);
                visited[i] = false;
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
