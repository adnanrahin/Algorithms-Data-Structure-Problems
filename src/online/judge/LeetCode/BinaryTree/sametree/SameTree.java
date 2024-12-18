package online.judge.LeetCode.BinaryTree.sametree;

public class SameTree {

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

        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null)
                return true;
            else if (p == null || q == null || p.val != q.val)
                return false;
            else if (q.val == p.val)
                return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
            else return false;

        }

    }

}
