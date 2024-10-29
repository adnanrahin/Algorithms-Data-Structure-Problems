package online.judge.LeetCode.BinaryTree.sumroottoleaf;

public class SumRootToLeaf {

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
        public int sumNumbers(TreeNode root) {
            if (root == null) return 0;
            return treeSum(root, 0);
        }

        public int treeSum(TreeNode root, int res) {
            if (root == null) return 0;
            res = (res * 10) + root.val;
            if (root.left == null && root.right == null) return res;
            return treeSum(root.left, res) + treeSum(root.right, res);
        }
    }

}
