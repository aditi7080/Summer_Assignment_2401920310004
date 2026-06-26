public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        preorder(root,sb);
        return sb.toString();
    }


    private void preorder(TreeNode node,StringBuilder sb){
        if(node==null){
            sb.append("null,");
            return;
        }
        sb.append(node.val).append(",");
        preorder(node.left,sb);
        preorder(node.right,sb);
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String [] arr=data.split(",");
        int [] idx={0};
        return buildTree(arr,idx);
    }
    private TreeNode buildTree(String [] arr, int[] idx){
        if(arr[idx[0]].equals("null")){
            idx[0]++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(arr[idx[0]++]));
        root.left=buildTree(arr,idx);
        root.right=buildTree(arr,idx);

        return root;
    }
}
