class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();

        if(root==null){
            return res;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> arr=new ArrayList<>();

            for(int i=0;i<s;i++){
                TreeNode node=q.poll();
                arr.add(node.val);

                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
            res.add(arr);
        }
        return res;
    }
}