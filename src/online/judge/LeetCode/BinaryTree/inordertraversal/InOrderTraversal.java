package online.judge.LeetCode.BinaryTree.inordertraversal;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {


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


        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> inOrderList = new ArrayList<>();
            if (root == null) return new ArrayList<>();
            postorderTraversal(root, inOrderList);
            return inOrderList;
        }

        public void postorderTraversal(TreeNode root, List<Integer> result) {
            if (root == null) return;
            postorderTraversal(root.left, result);
            postorderTraversal(root.right, result);
            result.add(root.val);
        }

    }

}
