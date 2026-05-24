/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode> parent = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int s = q.size();
            for(int i=0;i<s;i++){
                TreeNode nd = q.poll();
                if(nd.left != null){
                    parent.put(nd.left,nd);
                    q.add(nd.left);
                }
                if(nd.right != null){
                    parent.put(nd.right,nd);
                    q.add(nd.right);
                }
            }
        }
        HashMap<TreeNode,Boolean> vist = new HashMap<>();
        q.clear();
        q.add(target);
        vist.put(target,true);
        int dist = 0;
        while(!q.isEmpty()){
            int s = q.size();
            if(dist == k) break;
            for(int i=0;i<s;i++){
                TreeNode nd = q.poll();
                if(nd.left != null && vist.get(nd.left) == null){
                    q.add(nd.left);
                    vist.put(nd.left,true);
                }
                if(nd.right != null && vist.get(nd.right) == null){
                    q.add(nd.right);
                    vist.put(nd.right,true);
                }
                if(parent.get(nd) != null && vist.get(parent.get(nd)) == null){
                    q.add(parent.get(nd));
                    vist.put(parent.get(nd),true);
                }
            }
            dist++;
        }    
        List<Integer> res = new ArrayList<>();
        while(!q.isEmpty()) res.add(q.poll().val);

        return res;          
    }
}