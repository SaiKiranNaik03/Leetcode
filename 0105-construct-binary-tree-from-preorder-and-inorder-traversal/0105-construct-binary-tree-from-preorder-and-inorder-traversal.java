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

    TreeNode helper(int pre[], int pS, int pE,int in[], int iS, int iE,HashMap<Integer,Integer> map){

        if(pS > pE || iS > iE) return null;

        TreeNode root = new TreeNode(pre[pS]);

        int inRoot = map.get(root.val);

        int left = inRoot - iS;

        root.left = helper(pre,pS + 1,pS + left,in,iS,inRoot - 1,map);

        root.right = helper(pre,pS + left + 1,pE,in,inRoot + 1,iE,map);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }

        return helper(preorder, 0,preorder.length - 1,inorder,0,inorder.length - 1,map);
    }
}