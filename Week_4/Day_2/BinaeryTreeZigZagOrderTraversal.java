class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();

        if(root==null){
            return result;
        }
        Queue <TreeNode> q=new LinkedList<>();
        q.offer(root);

        boolean leftToright=true;

        while(!q.isEmpty()){
            int s=q.size();

            LinkedList<Integer> list=new LinkedList<>();

            for(int i=0;i<s;i++){
                TreeNode node=q.poll();

                if(leftToright){
                    list.addLast(node.val);
                }
                else{
                    list.addFirst(node.val);
                }
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
            result.add(list);
            leftToright =! leftToright;
        }
        return result;

    }
}