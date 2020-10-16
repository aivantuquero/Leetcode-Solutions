//reverse an array of char using recursion
//made by aivan

class Solution {
    public void reverseString(char[] s) {
        
        reverseRecursion(s, s.length-1, 0);
        
    }
    
    private static void reverseRecursion(char[]s, int i, int j){ 
        
        if(i <= j){
            return;
        }
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        
        reverseRecursion(s, --i, ++j);
        
    }
}
