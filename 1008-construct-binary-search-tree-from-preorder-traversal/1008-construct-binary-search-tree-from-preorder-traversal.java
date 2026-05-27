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
    void buildBST(TreeNode root,int ele){
        TreeNode cur = root;
        TreeNode node = new TreeNode(ele);
        while(true){
            if(cur.val < ele){
                if(cur.right == null){
                    cur.right = node;
                    break;
                }else cur = cur.right;
            }else{
                if(cur.left == null){
                    cur.left = node;
                    break;
                }else cur = cur.left;
            }
        }
        
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++) buildBST(root,preorder[i]);
        return root;
    }
}