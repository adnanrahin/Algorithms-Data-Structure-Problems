package online.judge.leetcode.symmetrictree;

public class SymmetricTree {

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
        public boolean isSymmetric(TreeNode root) {
            if (root == null) return true;
            return isSymmetric(root.left, root.right);
        }

        public boolean isSymmetric(TreeNode l, TreeNode r) {
            if (l == null && r == null) return true;
            else if (l == null || r == null || l.val != r.val) return false;
            else if (l.val == r.val)
                return isSymmetric(l.left, r.right) && isSymmetric(l.right, r.left);
            else return false;
        }
    }
}
