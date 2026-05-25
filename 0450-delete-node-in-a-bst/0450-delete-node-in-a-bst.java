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

    TreeNode findR(TreeNode node){
        while(node.right != null) node = node.right;
        return node;
    }
    TreeNode connect(TreeNode node){
        if(node.left == null) return node.right;
        if(node.right == null) return node.left;

        TreeNode rightC = node.right;
        TreeNode nextN = node.left;
        TreeNode leftR = findR(nextN);
        leftR.right = rightC;
        return nextN;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val == key){
            return connect(root);
        }
        TreeNode temp = root;

        while(temp != null){
            if(temp.val > key){
                if(temp.left != null && temp.left.val == key){
                    temp.left = connect(temp.left);
                    break;
                }else{
                    temp = temp.left;
                }
            }else{
                if(temp.right != null && temp.right.val == key){
                    temp.right = connect(temp.right);
                    break;
                }else{
                    temp = temp.right;
                }
            }
        }
        return root;
    }
}