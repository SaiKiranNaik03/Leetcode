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
    int cnt = 0;
    void travel(TreeNode node){
        if(node == null){
            return ;
        }else cnt++;

        travel(node.right);
        travel(node.left);

    }
    public int countNodes(TreeNode root) {
        travel(root);
        return cnt;
    }
}