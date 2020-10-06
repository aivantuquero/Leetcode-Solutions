class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length<=1||nums==null){
            return;
        }
        int counter=0;
        
        for(int i =0;i<nums.length;i++){
           
            if(nums[i]!=0){
                nums[counter++]=nums[i];
            }
        }
        while(counter<nums.length){
            nums[counter++]=0;
        }
        
    }
}