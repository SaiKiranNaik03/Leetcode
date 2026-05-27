/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class Solution {

    int maxi = 0;

    class Info {

        boolean isBST;
        int sum;
        int min;
        int max;

        Info(boolean isBST, int sum, int min, int max) {
            this.isBST = isBST;
            this.sum = sum;
            this.min = min;
            this.max = max;
        }
    }

    Info travel(TreeNode node) {

        if (node == null) {
            return new Info(true, 0,
                    Integer.MAX_VALUE,
                    Integer.MIN_VALUE);
        }

        Info left = travel(node.left);
        Info right = travel(node.right);

        if (left.isBST &&
            right.isBST &&
            node.val > left.max &&
            node.val < right.min) {

            int sum = left.sum + right.sum + node.val;

            maxi = Math.max(maxi, sum);

            int min = Math.min(node.val, left.min);
            int max = Math.max(node.val, right.max);

            return new Info(true, sum, min, max);
        }

        return new Info(false, 0, 0, 0);
    }

    public int maxSumBST(TreeNode root) {

        travel(root);

        return maxi;
    }
}