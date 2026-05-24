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
class Pair {
    TreeNode node;
    int idx;

    Pair(TreeNode node, int val) {
        this.node = node;
        this.idx = val;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int ans = 0;
        if(root == null) return ans;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));

        while(!q.isEmpty()){
            int len = q.size();
            int first,last;
            first = last = 0;
            int mini = q.peek().idx;
            for(int i=0;i<len;i++){
                Pair p = q.poll();
                TreeNode nd = p.node;
                int id = p.idx-mini;
                if(i == 0) first = id;
                if(i == len-1) last = id;

                if(nd.left != null) q.add(new Pair(nd.left,(2*id)+1));
                if(nd.right != null) q.add(new Pair(nd.right,(2*id)+2));
            }
            ans = Math.max(ans,last-first+1);
        }
        return ans;
    }
}