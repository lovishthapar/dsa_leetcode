class Solution {
    public boolean isPowerOfThree(int n) 
    {
        if(n<0)
        return false;
           
           if(Math.pow(3,19)% n==0)
           return true;
           else
           return false; 
    
        
    }
}