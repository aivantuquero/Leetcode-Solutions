class Solution {
    public int removeDuplicates(int[] nums) {
     if(nums.length == 0|| nums==null){
         return 0;
     }  
     int index = 0;
     int counter = 0;
              
        while(counter<nums.length){
            
            if(nums[index]!=nums[counter]){
                nums[index+1]=nums[counter++];
                index++;
            }
            else{
                counter++;
            }
            
            
        }
        return index+1;
        
    
        
        
        
    }
}