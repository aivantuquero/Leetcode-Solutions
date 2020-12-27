class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        
        if(root == null)return null;
        if(root.val == val){
            return root;
        }
        
        TreeNode next = null;
        
        if(val > root.val){
            next = searchBST(root.right, val);
        }
        else{
            next = searchBST(root.left, val);
        }
        
        return next;
        
    }
}
