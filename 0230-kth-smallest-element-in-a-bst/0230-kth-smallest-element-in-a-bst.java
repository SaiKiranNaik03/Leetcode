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
    ArrayList<Integer> inorder = new ArrayList<>();
    void travel(TreeNode node){
        if(node == null) return;

        travel(node.left);
        inorder.add(node.val);
        travel(node.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        travel(root);
        return inorder.get(k-1);
    }
}