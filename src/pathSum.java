class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        
        if(root == null)return false;
        
        sum -= root.val;
        
        //This will trigger if you hit the leaf node;
        if(root.right == null && root.left == null){
            
            if(sum == 0){
                return true;
            }
            return false;
            
        }
        
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum); 
        
    }
    
}
