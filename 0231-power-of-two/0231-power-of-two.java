class Solution {
    public boolean isPowerOfTwo(int n) 
    {
        if(n==1)
        return true;
        
        if(n<0 || n%2!=0)
        {
            return false;
        }
        int co1=0;
        int f=n;
        while(f>0)
        {
            int s=f%2;
            f=f/2;

            if(s==1)
            {
            co1++;
            }


        }
          if(co1==1)
          return true;
          else
          return false;
        
    }
}