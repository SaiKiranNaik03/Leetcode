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
    ArrayList<Integer> res = new ArrayList<>();
    void travel(TreeNode node){
        if(node == null) return ;

        travel(node.left);
        res.add(node.val);
        travel(node.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        travel(root);
        int i=0;
        int j=res.size()-1;

        while(i < j){
            int num = res.get(i) + res.get(j);
            if(num == k) return true;
            else if(num < k) i++;
            else j--;
        }
        return false;
    }
}