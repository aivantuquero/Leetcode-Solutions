class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null){
            return null;
        }
        if(root == p || root == q){
            return root;
        }
        TreeNode leftt = lowestCommonAncestor(root.left, p, q);
        TreeNode rightt = lowestCommonAncestor(root.right, p, q);
        
        if(leftt != null && rightt != null){
            return root;
        }
        if(leftt == null && rightt == null)return null;
        
        return leftt != null? leftt : rightt;
    }
}
