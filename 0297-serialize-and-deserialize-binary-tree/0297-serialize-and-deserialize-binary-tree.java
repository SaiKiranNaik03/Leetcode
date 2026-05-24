/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "";
        String str = "";
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode nd = q.poll();
            if(nd == null){
                str += "# ";
                continue;
            }
            str = str + nd.val +" ";
            q.add(nd.left);
            q.add(nd.right);
        }
        return str;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length() == 0) return null;
        String arr[] = data.split(" ");
        TreeNode root = new TreeNode(Integer.valueOf(arr[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        for(int i=1;i<arr.length;i++){
            TreeNode cur = q.poll();
            if(!arr[i].equals("#")){
                cur.left = new TreeNode(Integer.valueOf(arr[i]));
                q.add(cur.left);
            }
            if(!arr[++i].equals("#")){
                cur.right = new TreeNode(Integer.valueOf(arr[i]));
                q.add(cur.right);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));