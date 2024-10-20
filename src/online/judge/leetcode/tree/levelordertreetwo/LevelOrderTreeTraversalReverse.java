package online.judge.leetcode.tree.levelordertreetwo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTreeTraversalReverse {

    public static void main(String[] args) {

    }

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
        public List<List<Integer>> levelOrderBottom(TreeNode root) {

            if (root == null) return new ArrayList<>();

            List<List<Integer>> result = new ArrayList<>();

            Queue<TreeNode> queue = new LinkedList<>();

            queue.add(root);

            while (!queue.isEmpty()) {

                int size = queue.size();

                List<Integer> local = new ArrayList<>();

                for (int i = 0; i < size; i++) {

                    TreeNode parent = queue.poll();
                    local.add(parent.val);
                    if (parent.left != null) queue.add(parent.left);
                    if (parent.right != null) queue.add(parent.right);
                }

                result.add(0, local);

            }

            return result;

        }
    }

}
