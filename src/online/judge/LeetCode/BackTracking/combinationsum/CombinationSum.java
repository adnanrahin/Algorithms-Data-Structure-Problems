package online.judge.LeetCode.BackTracking.combinationsum;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {

        System.out.println(new Solution().combinationSum(new int[]{2, 3, 6, 7}, 7));

    }

}

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        backTrack(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    public void backTrack(int[] candidates, int target, int index, List<Integer> combination, List<List<Integer>> res) {

        if (target < 0) return;

        if (target == 0) {
            res.add(new ArrayList<>(combination));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            combination.add(candidates[i]);
            backTrack(candidates, target - candidates[i], i, combination, res);
            combination.remove(combination.size() - 1);
        }
    }

}
