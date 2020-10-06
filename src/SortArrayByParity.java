class Solution {
    public int[] sortArrayByParity(int[] A) {
        if(A.length==0 || A==null){
            return A;
        }
        //[2i,1,3,4c]3t
        int index=0;
        int checker=0;
        while(checker<A.length){
            if(A[checker]%2==0){
                int temp=A[index];
                A[index++]=A[checker];
                A[checker++]=temp;
            }else{
                checker++;
            }
            
        }
        
        return A;
    }
}