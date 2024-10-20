package online.judge.leetcode.binarytreepath;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {

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
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> result = new ArrayList<>();

            preOrderTraversal(root, "", result);

            return result;
        }

        public void preOrderTraversal(TreeNode root, String str, List<String> list) {
            if (root == null) return;
            if (root.left == null && root.right == null) {
                str += root.val;
                list.add(str);
            } else str += root.val + "->";

            preOrderTraversal(root.left, str, list);
            preOrderTraversal(root.right, str, list);
        }

    }

}
