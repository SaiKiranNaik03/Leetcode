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

    List<String> res = new ArrayList<>();

    void travel(TreeNode node, String str){
        if(node == null) return;

        str += node.val;

        if(node.left == null && node.right == null){
            res.add(str);
            return;
        }

        str += "->";

        travel(node.left, str);
        travel(node.right, str);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        travel(root, "");
        return res;
    }
}