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
    ArrayList<Integer> order = new ArrayList<>();

    void getOrder(TreeNode node){
        if(node == null) return ;

        getOrder(node.left);
        order.add(node.val);
        getOrder(node.right);
    }
    int i = 0;
    void setOrder(TreeNode node){
        if(node == null) return;

        setOrder(node.left);
        node.val = order.get(i++);
        setOrder(node.right);
    }
    public void recoverTree(TreeNode root) {
        getOrder(root);
        Collections.sort(order);
        setOrder(root);
    }
}