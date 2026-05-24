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
    int heightL(TreeNode node){
        int cnt = 0;
        while(node != null){
            node = node.left;
            cnt++;
        }
        return cnt;
    }
    int heightR(TreeNode node){
        int cnt = 0;
        while(node != null){
            node = node.right;
            cnt++;
        }
        return cnt;
    }
    public int countNodes(TreeNode root) {
        if(root == null) return 0;

        int left = heightL(root);
        int right = heightR(root);

        if(left == right) return (1 << left)-1 ;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

}