class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int a = 0;
        int b = 1;
        
        while(a<nums.length){
            
            if(nums[a]+nums[b]==target){
                break;
            }else{
                
                b++;
                if(b>=nums.length){
                    a++;
                    b=a+1;
                }
                
                
            }
            
        }
        
         int[]arr = {a,b};
                return arr;
    }
}