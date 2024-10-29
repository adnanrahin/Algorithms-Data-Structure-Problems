package online.judge.LeetCode.BinaryTree.rightsideview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {

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
        public List<Integer> rightSideView(TreeNode root) {
            if (root == null) return new ArrayList<>();
            List<List<Integer>> cache = new ArrayList<>();
            List<Integer> result = new ArrayList<>();

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
                result.add(local.get(local.size() - 1));
            }
            return result;
        }
    }

}
