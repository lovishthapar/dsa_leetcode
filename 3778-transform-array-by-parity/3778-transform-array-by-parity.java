class Solution {
    public int[] transformArray(int[] n)
     {
        int nr[]=new int[n.length];
        int s=0;
        int e=n.length-1;
        for(int i=0;i<n.length;i++)
        {
            if(n[i]%2==0)
            {
                nr[s]=0;
                s++;


            }
            else
            {
                nr[e]=1;
                e--;
            }

        }
        return nr;

        
    }
}