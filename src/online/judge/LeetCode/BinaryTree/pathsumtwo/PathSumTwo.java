package online.judge.LeetCode.BinaryTree.pathsumtwo;

import java.util.ArrayList;
import java.util.List;

public class PathSumTwo {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

            List<List<Integer>> result = new ArrayList<>();

            pathSum(root, targetSum, new ArrayList<>(), result);

            return result;
        }

        public void pathSum(TreeNode root, int target, List<Integer> list, List<List<Integer>> result) {

            if (root == null) return;

            if (target - root.val == 0 && root.left == null && root.right == null) {
                list.add(root.val);
                result.add(new ArrayList<>(list));
                list.remove(list.size() - 1);
                return;
            }

            list.add(root.val);
            pathSum(root.left, target - root.val, list, result);
            pathSum(root.right, target - root.val, list, result);
            list.remove(list.size() - 1);

        }
    }

}
