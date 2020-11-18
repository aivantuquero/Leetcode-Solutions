class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        LinkedList <Integer> ll = new LinkedList<>();
        if(root == null)return ll;
        
        Stack<TreeNode> stck = new Stack<>();
        TreeNode curr = root;
        
        while(!stck.empty() || curr != null){
            
            if(curr != null){
                
                stck.push(curr);
                curr = curr.left;
                
            }
            else{
                curr = stck.peek().right;
                if(curr == null){
                    TreeNode last = null;
                    
                    while(!stck.empty() && last == stck.peek().right ){
                        
                        last = stck.peek();
                        stck.pop();
                        ll.add(last.val);
                    }
                }
            }
        }
        
        return ll;
    }
}
