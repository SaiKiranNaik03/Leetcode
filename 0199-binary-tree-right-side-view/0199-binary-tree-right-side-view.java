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
    List<Integer> res = new ArrayList<>();
    void travel(TreeNode node, int level){
        if(node == null) return ;

        if(level == res.size()) res.add(node.val);
        travel(node.right,level+1);
        travel(node.left,level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        travel(root,0);
        return res;
    }   
}