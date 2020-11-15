class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> ll = new LinkedList<>();
        
        if(root == null)return ll;
        
            Stack<TreeNode> st = new Stack<>();
            st.push(root);

            while(!st.empty()){

                TreeNode curr = st.peek();
                st.pop();
                ll.add(curr.val);

                if(curr.right != null){
                    st.push(curr.right);
                }

                if(curr.left != null){
                    st.push(curr.left);
                }

            }
        
        return ll;
    }
}
