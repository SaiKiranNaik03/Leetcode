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
    int ans = -1;
    int cnt = 0;
    void travel(TreeNode node, int k){
        if(node == null) return ;

        travel(node.left, k);
        cnt++;
        if(cnt == k){
            ans = node.val;
            return ;
        }
        travel(node.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        travel(root,k);
        return ans;
    }
}