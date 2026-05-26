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
    Stack<TreeNode> stk1 = new Stack<>();
    Stack<TreeNode> stk2 = new Stack<>();

    void pushL(TreeNode node){
        while(node != null){
            stk1.push(node);
            node = node.left;
        }
    }
    int next(){
        if(!stk1.isEmpty()){
            TreeNode nd = stk1.pop();
            pushL(nd.right);
            return nd.val;
        }
        return -1;
    }

    void pushR(TreeNode node){
        while(node != null){
            stk2.push(node);
            node = node.right;
        }
    }
    int before(){
        if(!stk2.isEmpty()){
            TreeNode nd = stk2.pop();
            pushR(nd.left);
            return nd.val;
        }
        return -1;
    }
    public boolean findTarget(TreeNode root, int k) {
        pushL(root);
        pushR(root);
        int num1 = next();
        int num2 = before();
        while(num1 < num2 ){
            int sum = num1 + num2;
            if(sum == k){
                return true;
            }else if(sum < k) num1 = next();
            else num2 = before();
        }
        return false;
    }
}