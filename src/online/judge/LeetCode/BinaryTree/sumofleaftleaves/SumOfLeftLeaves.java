package online.judge.LeetCode.BinaryTree.sumofleaftleaves;

public class SumOfLeftLeaves {

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
        public int sumOfLeftLeaves(TreeNode root) {
            if(root == null) return 0;
            return sumOfLeaves(root, 0, false);
        }

        public int sumOfLeaves(TreeNode root, int sum, boolean isLeft) {

            if (root == null) return 0;
            if (root.left == null && root.right == null && isLeft) {
                sum += root.val;
            }
            return sumOfLeaves(root.left, sum, true) + sumOfLeaves(root.right, sum, false);

        }

    }

}
