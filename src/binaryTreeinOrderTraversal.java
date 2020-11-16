class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> ll = new LinkedList<>();
        
        if(root == null)return ll;
        
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        
        while(!st.empty() || curr != null){
            
            if(curr != null){
                st.push(curr);
                curr = curr.left;
            }
            else{
                curr = st.peek();
                ll.add(curr.val);
                curr = curr.right;
                st.pop();
            }
            
        }
        
        return ll;
        
    }
}
