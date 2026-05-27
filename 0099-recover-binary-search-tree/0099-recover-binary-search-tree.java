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
    TreeNode prev,first,mid,last;

    void travel(TreeNode node){
        if(node == null) return;

        travel(node.left);
        if(prev != null && (node.val < prev.val)){
            if(first == null){
                first = prev;
                mid = node;
            }else last = node;
        }
        prev = node;
        travel(node.right);

    }
    public void recoverTree(TreeNode root) {
        first = mid = last = null;
        prev = new TreeNode(Integer.MIN_VALUE);
        travel(root);
        if(last == null){
            int temp = mid.val;
            mid.val = first.val;
            first.val = temp;
        }else{
            int temp = last.val;
            last.val = first.val;
            first.val = temp;
        }
    }
}