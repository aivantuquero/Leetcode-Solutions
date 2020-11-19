class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> wrapList = new LinkedList<>();
        
        if(root == null)return wrapList;
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int size = queue.size();
            List<Integer> subList = new LinkedList<>();
            
            for(int i = 0; i < size; i++){
                
                if(queue.peek().left != null){
                    
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.add(queue.peek().right);
                }
                
                subList.add(queue.poll().val);
            }
            wrapList.add(subList);
            
        }
        
        return wrapList;
        
    }
}
