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
    int maxi = Integer.MIN_VALUE;
    int helper(TreeNode node){
        if(node == null) return 0;

        int left = helper(node.left);
        if(left < 0) left = 0;
        int right = helper(node.right);
        if(right < 0) right = 0;
        
        maxi = Math.max(left+right+node.val, maxi);

        return node.val + Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxi;
    }
}