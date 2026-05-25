/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        while(true){
            if(root == p || root == q) return root;
            if((root.val > p.val && q.val > root.val) || (root.val > q.val && p.val > root.val)) return root;

            if(root.val > p.val && root.val > q.val) root = root.left;
            else root = root.right;
        }
    }
}