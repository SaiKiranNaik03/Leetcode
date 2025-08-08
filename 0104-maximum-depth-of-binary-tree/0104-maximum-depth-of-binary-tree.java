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
    public int maxDepth(TreeNode root) {
        TreeNode node = root;
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        int level = 0;
        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0;i<len;i++){
                TreeNode nd = q.poll();
                if(nd.left != null) q.add(nd.left);
                if(nd.right != null) q.add(nd.right);
            }
            level++;
        }
        return level;
    }
}