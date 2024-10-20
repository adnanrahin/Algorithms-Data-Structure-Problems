package online.judge.leetcode.tree.levelordertreetraversal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LevelOrderTreeTraversal {

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
        public List<List<Integer>> levelOrder(TreeNode root) {

            List<List<Integer>> result = new ArrayList<>();
            Map<Integer, List<Integer>> levelOrderMap = new HashMap<>();

            depthFirstSearch(root, 0, levelOrderMap);

            for (Integer itr : levelOrderMap.keySet())
                result.add(levelOrderMap.get(itr));

            return result;

        }

        public void depthFirstSearch(TreeNode root, int level, Map<Integer, List<Integer>> levelOrderMap) {
            if (root == null) return;
            if (!levelOrderMap.containsKey(level)) {
                levelOrderMap.put(level, new ArrayList<>());
            }
            levelOrderMap.get(level).add(root.val);
            depthFirstSearch(root.left, level + 1, levelOrderMap);
            depthFirstSearch(root.right, level + 1, levelOrderMap);
        }
    }

}
