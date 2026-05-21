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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int flag = 1;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode nd = q.poll();
                if(nd.left != null) q.add(nd.left);
                if(nd.right != null) q.add(nd.right);
                temp.add(nd.val);
            }
            if(flag%2 == 0) Collections.reverse(temp);
            res.add(temp);
            flag++;
        }
        return res;
    }
}