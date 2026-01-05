class Solution {
    public int mirrorDistance(int n) 
    {
        int e=n;
        int rev=0;
        while(e>0)
        {
            int rem=e%10;
            e=e/10;
            rev=rev*10+rem;

        }
        return Math.abs(rev-n);
        
    }
}