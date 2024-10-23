package online.judge.leetcode.backtrack.combinationsumtwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumTwo {

    public static void main(String[] args) {

        System.out.println(combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
        System.out.println(combinationSum2(new int[]{2, 5, 2, 1, 2}, 5));

    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);

        combinationSumBacktrack(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    public static void combinationSumBacktrack(int[] candidates, int target, int index, List<Integer> combination, List<List<Integer>> result) {

        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) continue;
            else {
                combination.add(candidates[i]);
                combinationSumBacktrack(candidates, target - candidates[i], i + 1, combination, result);
                combination.remove(combination.size() - 1);
            }
        }

    }

}
