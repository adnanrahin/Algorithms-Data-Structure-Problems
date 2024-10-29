package online.judge.LeetCode.BinaryTree.zigzagordertreetraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagOrderTreeTraversal {

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
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

            if (root == null) return new ArrayList<>();

            List<List<Integer>> result = new ArrayList<>();

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int level = 0;

            while (!queue.isEmpty()) {

                int size = queue.size();
                List<Integer> local = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode u = queue.poll();
                    if (level % 2 == 0) {
                        local.add(u.val);
                    } else {
                        local.add(0, u.val);
                    }
                    if (u.left != null) queue.add(u.left);
                    if (u.right != null) queue.add(u.right);
                }
                result.add(local);
                level++;

            }
            return result;
        }
    }

}
